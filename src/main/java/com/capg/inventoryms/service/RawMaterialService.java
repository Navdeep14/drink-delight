package com.capg.inventoryms.service;

import java.text.ParseException;
import java.util.*;

import com.capg.inventoryms.entities.RawMaterialStock;

public interface RawMaterialService {
	
	public void addRawMaterial(RawMaterialStock rawMaterialStock);
	public String trackRawMaterialOrder(RawMaterialStock rawMaterialStock);
	public boolean doesRawMaterialOrderIdExist(String Id);
	public boolean processDateCheck(RawMaterialStock rawMaterialStock);
	public boolean validateManufacturingDate(Date manufacturing_date);
	public boolean validateExpiryDate(Date manufacturing_date,Date expiry_date) throws ParseException;
	public String updateRawMaterialStock(RawMaterialStock rawMaterialStock);
	public boolean doesRawMaterialOrderIdExistinStock(String orderId);
	
	

}
