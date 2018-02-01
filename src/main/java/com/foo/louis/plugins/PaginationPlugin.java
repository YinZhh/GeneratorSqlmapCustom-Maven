package com.foo.louis.plugins;

import java.util.List;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class PaginationPlugin extends PluginAdapter {

	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		addPage(topLevelClass, introspectedTable, "page");
		return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
	}

	@Override
	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		XmlElement page = new XmlElement("if");
		page.addAttribute(new Attribute("test", "page != null"));
		// page.addElement(new TextElement("limit #{page.offset} , #{page.pageSize}"));
		//page.addElement(new TextElement("limit #{page.startIndex} , #{page.pageSize}"));
		page.addElement(new TextElement("LIMIT #{pageSize,jdbcType=INTEGER} offset #{startRow,jdbcType=INTEGER}"));
		
		element.addElement(page);
		return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
	}

	@Override
	public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
		XmlElement page = new XmlElement("if");
		page.addAttribute(new Attribute("test", "page != null"));
		// page.addElement(new TextElement("limit #{page.offset} , #{page.pageSize}"));
		page.addElement(new TextElement("LIMIT #{pageSize,jdbcType=INTEGER} offset #{startRow,jdbcType=INTEGER}"));
		element.addElement(page);
		return super.sqlMapSelectByExampleWithBLOBsElementGenerated(element, introspectedTable);
	}

	/**
	 * @param topLevelClass
	 * @param introspectedTable
	 * @param name
	 */
	private void addPage(TopLevelClass topLevelClass, IntrospectedTable introspectedTable, String name) {
		topLevelClass.addImportedType(new FullyQualifiedJavaType("generator.yzh.Page<?>"));
		// topLevelClass.addImportedType(FullyQualifiedJavaType.getIntInstance());
		CommentGenerator commentGenerator = context.getCommentGenerator();
		Field field = new Field();
		field.setVisibility(JavaVisibility.PROTECTED);
		field.setType(new FullyQualifiedJavaType("generator.yzh.Page<?>"));
		// field.setType(FullyQualifiedJavaType.getIntInstance());
		field.setName(name);
		commentGenerator.addFieldComment(field, introspectedTable);
		topLevelClass.addField(field);
		char c = name.charAt(0);
		String camel = Character.toUpperCase(c) + name.substring(1);
		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setName("set" + camel);
		// method.addParameter(new Parameter(FullyQualifiedJavaType.getIntInstance(),
		// name));
		method.addParameter(new Parameter(new FullyQualifiedJavaType("generator.yzh.Page<?>"), name));
		method.addBodyLine("this." + name + "=" + name + ";");
		commentGenerator.addGeneralMethodComment(method, introspectedTable);
		topLevelClass.addMethod(method);
		method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		// method.setReturnType(FullyQualifiedJavaType.getIntInstance());
		method.setReturnType(new FullyQualifiedJavaType("generator.yzh.Page<?>"));
		method.setName("get" + camel);
		method.addBodyLine("return " + name + ";");
		commentGenerator.addGeneralMethodComment(method, introspectedTable);
		topLevelClass.addMethod(method);
	}

	public boolean validate(List<String> arg0) {
		return true;
	}
}
