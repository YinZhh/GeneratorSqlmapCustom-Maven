package org.louis.hometutor.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class IInventoryList implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.guid
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String guid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.inventory_guid
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String inventoryGuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.gnum
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String gnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.item_no
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String itemNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.gno
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String gno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.gcode
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String gcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.gname
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String gname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.gmodel
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String gmodel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.barcode
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String barcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.country
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.currency
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.qty
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private BigDecimal qty;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.qty1
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private BigDecimal qty1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.qty2
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private BigDecimal qty2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.unit
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String unit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.unit1
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String unit1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.unit2
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String unit2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.price
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private BigDecimal price;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.total
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private BigDecimal total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.product_guid
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String productGuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.enterprise_id
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private Integer enterpriseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.pack_number
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private BigDecimal packNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_export_inventory_list.pack_type_code
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private String packTypeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_export_inventory_list
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.guid
     *
     * @return the value of t_export_inventory_list.guid
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.guid
     *
     * @param guid the value for t_export_inventory_list.guid
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.inventory_guid
     *
     * @return the value of t_export_inventory_list.inventory_guid
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getInventoryGuid() {
        return inventoryGuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.inventory_guid
     *
     * @param inventoryGuid the value for t_export_inventory_list.inventory_guid
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setInventoryGuid(String inventoryGuid) {
        this.inventoryGuid = inventoryGuid == null ? null : inventoryGuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.gnum
     *
     * @return the value of t_export_inventory_list.gnum
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getGnum() {
        return gnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.gnum
     *
     * @param gnum the value for t_export_inventory_list.gnum
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setGnum(String gnum) {
        this.gnum = gnum == null ? null : gnum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.item_no
     *
     * @return the value of t_export_inventory_list.item_no
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getItemNo() {
        return itemNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.item_no
     *
     * @param itemNo the value for t_export_inventory_list.item_no
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.gno
     *
     * @return the value of t_export_inventory_list.gno
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getGno() {
        return gno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.gno
     *
     * @param gno the value for t_export_inventory_list.gno
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setGno(String gno) {
        this.gno = gno == null ? null : gno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.gcode
     *
     * @return the value of t_export_inventory_list.gcode
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getGcode() {
        return gcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.gcode
     *
     * @param gcode the value for t_export_inventory_list.gcode
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setGcode(String gcode) {
        this.gcode = gcode == null ? null : gcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.gname
     *
     * @return the value of t_export_inventory_list.gname
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getGname() {
        return gname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.gname
     *
     * @param gname the value for t_export_inventory_list.gname
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.gmodel
     *
     * @return the value of t_export_inventory_list.gmodel
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getGmodel() {
        return gmodel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.gmodel
     *
     * @param gmodel the value for t_export_inventory_list.gmodel
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setGmodel(String gmodel) {
        this.gmodel = gmodel == null ? null : gmodel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.barcode
     *
     * @return the value of t_export_inventory_list.barcode
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.barcode
     *
     * @param barcode the value for t_export_inventory_list.barcode
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.country
     *
     * @return the value of t_export_inventory_list.country
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.country
     *
     * @param country the value for t_export_inventory_list.country
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.currency
     *
     * @return the value of t_export_inventory_list.currency
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.currency
     *
     * @param currency the value for t_export_inventory_list.currency
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.qty
     *
     * @return the value of t_export_inventory_list.qty
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.qty
     *
     * @param qty the value for t_export_inventory_list.qty
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.qty1
     *
     * @return the value of t_export_inventory_list.qty1
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public BigDecimal getQty1() {
        return qty1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.qty1
     *
     * @param qty1 the value for t_export_inventory_list.qty1
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setQty1(BigDecimal qty1) {
        this.qty1 = qty1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.qty2
     *
     * @return the value of t_export_inventory_list.qty2
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public BigDecimal getQty2() {
        return qty2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.qty2
     *
     * @param qty2 the value for t_export_inventory_list.qty2
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setQty2(BigDecimal qty2) {
        this.qty2 = qty2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.unit
     *
     * @return the value of t_export_inventory_list.unit
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getUnit() {
        return unit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.unit
     *
     * @param unit the value for t_export_inventory_list.unit
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.unit1
     *
     * @return the value of t_export_inventory_list.unit1
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getUnit1() {
        return unit1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.unit1
     *
     * @param unit1 the value for t_export_inventory_list.unit1
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setUnit1(String unit1) {
        this.unit1 = unit1 == null ? null : unit1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.unit2
     *
     * @return the value of t_export_inventory_list.unit2
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getUnit2() {
        return unit2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.unit2
     *
     * @param unit2 the value for t_export_inventory_list.unit2
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setUnit2(String unit2) {
        this.unit2 = unit2 == null ? null : unit2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.price
     *
     * @return the value of t_export_inventory_list.price
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.price
     *
     * @param price the value for t_export_inventory_list.price
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.total
     *
     * @return the value of t_export_inventory_list.total
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.total
     *
     * @param total the value for t_export_inventory_list.total
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.product_guid
     *
     * @return the value of t_export_inventory_list.product_guid
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getProductGuid() {
        return productGuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.product_guid
     *
     * @param productGuid the value for t_export_inventory_list.product_guid
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setProductGuid(String productGuid) {
        this.productGuid = productGuid == null ? null : productGuid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.enterprise_id
     *
     * @return the value of t_export_inventory_list.enterprise_id
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.enterprise_id
     *
     * @param enterpriseId the value for t_export_inventory_list.enterprise_id
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.pack_number
     *
     * @return the value of t_export_inventory_list.pack_number
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public BigDecimal getPackNumber() {
        return packNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.pack_number
     *
     * @param packNumber the value for t_export_inventory_list.pack_number
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setPackNumber(BigDecimal packNumber) {
        this.packNumber = packNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_export_inventory_list.pack_type_code
     *
     * @return the value of t_export_inventory_list.pack_type_code
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public String getPackTypeCode() {
        return packTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_export_inventory_list.pack_type_code
     *
     * @param packTypeCode the value for t_export_inventory_list.pack_type_code
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    public void setPackTypeCode(String packTypeCode) {
        this.packTypeCode = packTypeCode == null ? null : packTypeCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_export_inventory_list
     *
     * @mbggenerated Mon Jan 15 11:52:07 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", guid=").append(guid);
        sb.append(", inventoryGuid=").append(inventoryGuid);
        sb.append(", gnum=").append(gnum);
        sb.append(", itemNo=").append(itemNo);
        sb.append(", gno=").append(gno);
        sb.append(", gcode=").append(gcode);
        sb.append(", gname=").append(gname);
        sb.append(", gmodel=").append(gmodel);
        sb.append(", barcode=").append(barcode);
        sb.append(", country=").append(country);
        sb.append(", currency=").append(currency);
        sb.append(", qty=").append(qty);
        sb.append(", qty1=").append(qty1);
        sb.append(", qty2=").append(qty2);
        sb.append(", unit=").append(unit);
        sb.append(", unit1=").append(unit1);
        sb.append(", unit2=").append(unit2);
        sb.append(", price=").append(price);
        sb.append(", total=").append(total);
        sb.append(", productGuid=").append(productGuid);
        sb.append(", enterpriseId=").append(enterpriseId);
        sb.append(", packNumber=").append(packNumber);
        sb.append(", packTypeCode=").append(packTypeCode);
        sb.append("]");
        return sb.toString();
    }
}