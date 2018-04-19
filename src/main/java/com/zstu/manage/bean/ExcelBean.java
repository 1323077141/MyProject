package com.zstu.manage.bean;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;

import java.io.Serializable;

public class ExcelBean implements Serializable{
    private static final long serialVersionUID = 1L;

    //标题名
    private String headTextName;
    //字段名
    private String propertyName;
    //合并单元格数
    private Integer cols;
    private XSSFCellStyle cellStyle;

    public ExcelBean() {
        // TODO Auto-generated constructor stub
    }

    public ExcelBean(String headTextName, String propertyName) {
        super();
        this.headTextName = headTextName;
        this.propertyName = propertyName;
    }

    public ExcelBean(String headTextName, String propertyName, Integer cols) {
        super();
        this.headTextName = headTextName;
        this.propertyName = propertyName;
        this.cols = cols;
    }

    public String getHeadTextName() {
        return headTextName;
    }

    public void setHeadTextName(String headTextName) {
        this.headTextName = headTextName;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Integer getCols() {
        return cols;
    }

    public void setCols(Integer cols) {
        this.cols = cols;
    }

    public XSSFCellStyle getCellStyle() {
        return cellStyle;
    }

    public void setCellStyle(XSSFCellStyle cellStyle) {
        this.cellStyle = cellStyle;
    }

}
