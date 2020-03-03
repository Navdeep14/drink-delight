package com.capg.inventoryms.entities;

import java.util.*;

public class RawMaterialStock {
	public static String orderId;
	private String name;
	private double price_per_unit;
	private double quantityValue;
	private double quantityUnit;
	private double price;
	private String warehouseID;
	private Date deliveryDate;
	public static Date manufacturingDate;
	public static Date expiryDate;
	private String equalityCheck;
	public static Date processDate;
	
	public RawMaterialStock(String orderId,String name,double price_per_unit,double quantityValue,double quantityUnit,double price,String warehouseID,Date deliveryDate,Date manufacturingDate,Date expiryDate,String equalityCheck,Date processDate){
		
		this.orderId=orderId;
		this.name=name;
		this.price_per_unit=price_per_unit;
		this.quantityValue=quantityValue;
		this.quantityUnit=quantityUnit;
		this.price=price;
		this.warehouseID=warehouseID;
		this.deliveryDate=deliveryDate;
		this.manufacturingDate=manufacturingDate;
		this.expiryDate=expiryDate;
		this.equalityCheck=equalityCheck;
		this.processDate=processDate;
		
	}
	
	public RawMaterialStock()
	{
		
	}
	
	public RawMaterialStock(String orderId, String name, String warehouseID ) {
		this.orderId = orderId;
		this.name = name;
		this.warehouseID = warehouseID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryDate == null) ? 0 : deliveryDate.hashCode());
		result = prime * result + ((equalityCheck == null) ? 0 : equalityCheck.hashCode());
		result = prime * result + ((expiryDate == null) ? 0 : expiryDate.hashCode());
		result = prime * result + ((manufacturingDate == null) ? 0 : manufacturingDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(price_per_unit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((processDate == null) ? 0 : processDate.hashCode());
		temp = Double.doubleToLongBits(quantityUnit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(quantityValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((warehouseID == null) ? 0 : warehouseID.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RawMaterialStock other = (RawMaterialStock) obj;
		if (deliveryDate == null) {
			if (other.deliveryDate != null)
				return false;
		} else if (!deliveryDate.equals(other.deliveryDate))
			return false;
		if (equalityCheck == null) {
			if (other.equalityCheck != null)
				return false;
		} else if (!equalityCheck.equals(other.equalityCheck))
			return false;
		if (expiryDate == null) {
			if (other.expiryDate != null)
				return false;
		} else if (!expiryDate.equals(other.expiryDate))
			return false;
		if (manufacturingDate == null) {
			if (other.manufacturingDate != null)
				return false;
		} else if (!manufacturingDate.equals(other.manufacturingDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(price_per_unit) != Double.doubleToLongBits(other.price_per_unit))
			return false;
		if (processDate == null) {
			if (other.processDate != null)
				return false;
		} else if (!processDate.equals(other.processDate))
			return false;
		if (Double.doubleToLongBits(quantityUnit) != Double.doubleToLongBits(other.quantityUnit))
			return false;
		if (Double.doubleToLongBits(quantityValue) != Double.doubleToLongBits(other.quantityValue))
			return false;
		if (warehouseID == null) {
			if (other.warehouseID != null)
				return false;
		} else if (!warehouseID.equals(other.warehouseID))
			return false;
		return true;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice_per_unit() {
		return price_per_unit;
	}
	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}
	public double getQuantityValue() {
		return quantityValue;
	}
	public void setQuantityValue(double quantityValue) {
		this.quantityValue = quantityValue;
	}
	public double getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(double quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getWarehouseID() {
		return warehouseID;
	}
	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Date getManufacturingDate() {
		return manufacturingDate;
	}
	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getEqualityCheck() {
		return equalityCheck;
	}
	public void setEqualityCheck(String equalityCheck) {
		this.equalityCheck = equalityCheck;
	}
	public Date getProcessDate() {
		return processDate;
	}
	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

}
