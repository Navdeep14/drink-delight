package com.capg.inventoryms.dao;

import com.capg.inventoryms.entities.RawMaterialStock;

public interface RawMaterialDao {
	
	public void addRawMaterial(RawMaterialStock rawMaterialStock);
	public String trackRawMaterialOrder(RawMaterialStock RawMaterialStock);
	public boolean processDateCheck(RawMaterialStock rawMaterialStock);
	public String updateProcessDateinStock(RawMaterialStock rawMaterialStock);
	public String updateRawMaterialStock(RawMaterialStock rawMaterialStock);
	public boolean doesRawMaterialOrderIdExistinStock(String ordrId);
	public boolean doesRawMaterialOrderIdExist(String orderId);

}
