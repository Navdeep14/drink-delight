package com.capg.inventoryms.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.inventoryms.entities.RawMaterialStock;
import com.capg.inventoryms.exception.IncorrectIdException;


public class RawMaterialDaoImpl implements RawMaterialDao {
	
	public static Map<String, RawMaterialStock> store = new HashMap<>();
	
	public void addRawMaterial(RawMaterialStock rawMaterialStock)
	{
		store.put(rawMaterialStock.getOrderId(), rawMaterialStock);
	}
    
	@Override
	public String trackRawMaterialOrder(RawMaterialStock rawMaterialStock) {
		if(rawMaterialStock.getOrderId() == null)
		{
			throw new IncorrectIdException("Invalid order Id");
		}
		
		store.put(rawMaterialStock.getOrderId(), rawMaterialStock);
		return rawMaterialStock.getName();
	}

	@Override
	public boolean processDateCheck(RawMaterialStock rawMaterialStock) {
		if (rawMaterialStock.getProcessDate()==RawMaterialStock.processDate)
		return true;
		else
			return false;
	}

	@Override
	public String updateProcessDateinStock(RawMaterialStock rawMaterialStock)
	{
		if(rawMaterialStock.getOrderId() == null)
		{
			throw new IncorrectIdException("Invalid order Id");
		}
		
		store.put(rawMaterialStock.getProcessDate().toString(), rawMaterialStock);
		return "data inserted";
		
		
	}

	@Override
	public String updateRawMaterialStock(RawMaterialStock rawMaterialStock) {
		
		if(rawMaterialStock.getOrderId() == null)
		{
			throw new IncorrectIdException("Invalid order Id");
		}
		store.put(rawMaterialStock.getOrderId(), rawMaterialStock);
		return rawMaterialStock.getWarehouseID();
	}

	@Override
	public boolean doesRawMaterialOrderIdExistinStock(String orderId) {
		if (orderId==RawMaterialStock.orderId)
		return true;
		else
			return false;
	}

	@Override
	public boolean doesRawMaterialOrderIdExist(String orderId) {
		if (orderId==null)
			return false;
		else
			return true;	
	}

}
