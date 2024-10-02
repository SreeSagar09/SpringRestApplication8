package com.app.model;

public class Product {
	private String productCode;
	private String productName;
	private Double unitPrice;
	private Integer quantity;
	private String supplierName;
	
	public Product() {
		super();
	}

	public Product(String productCode, String productName, Double unitPrice, Integer quantity, String supplierName) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.supplierName = supplierName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", unitPrice=" + unitPrice
				+ ", quantity=" + quantity + ", supplierName=" + supplierName + "]";
	}
	
}
