package com.foo.louis.plugins;

import java.util.Iterator;
import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.xml.Element;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class DeleteByExampleMysqlBugFixedPlugin extends PluginAdapter {

  @Override
  public boolean validate(List<String> warnings) {
    return true;
  }

  @Override
  public boolean sqlMapDeleteByExampleElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {

    List<Element> elements = element.getElements();
    Iterator<Element> it = elements.iterator();
    while (it.hasNext()) {
      Element e = it.next();
      if (e instanceof TextElement) {
        String content = ((TextElement) e).getContent();
        if (content.contains("delete from")) {
          it.remove();
          break;
        }
      }
    }
    StringBuilder sb = new StringBuilder();
    sb.append("delete from "); //$NON-NLS-1$
    sb.append(introspectedTable.getFullyQualifiedTableNameAtRuntime());
    element.addElement(elements.size() - 1, new TextElement(sb.toString()));
    return true;
  }
}
