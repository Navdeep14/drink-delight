package com.capg.inventoryms.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.capg.inventoryms.dao.RawMaterialDao;
import com.capg.inventoryms.dao.RawMaterialDaoImpl;
import com.capg.inventoryms.entities.RawMaterialStock;
import com.capg.inventoryms.exception.IncorrectArgumentException;
import com.capg.inventoryms.exception.IncorrectIdException;


public class RawMaterialServiceImpl implements RawMaterialService {
	 private RawMaterialDao dao;
	 public RawMaterialServiceImpl(RawMaterialDaoImpl rawMaterialDaoImpl) {
		this.dao=rawMaterialDaoImpl;
	}

	@Override
	public String trackRawMaterialOrder(RawMaterialStock rawMaterialStock) {
	
		if(rawMaterialStock == null)
		{
			throw new IncorrectArgumentException("Stock is empty");
		}
		
		dao.trackRawMaterialOrder(rawMaterialStock);
		return null;
	}

	@Override
	public boolean doesRawMaterialOrderIdExist(String Id) {
		return dao.doesRawMaterialOrderIdExist(Id);
	
	}

	@Override
	public boolean processDateCheck(RawMaterialStock rawMaterialStock) {
		return dao.processDateCheck(rawMaterialStock);
		
	}

	@Override
	public boolean validateManufacturingDate(Date manufacturing_date) {
	if(manufacturing_date==RawMaterialStock.manufacturingDate)
		return true;
	else
		return false;
	}

	@Override
	public boolean validateExpiryDate(Date manufacturing_date, Date expiry_date) throws ParseException
	{
		Date date1 = new Date();
		String [] str=date1.toString().split(" ");
	    String date = str[2]+"/"+str[1]+"/"+str[5];
	    Date currentDate=new SimpleDateFormat("dd/MMM/yyyy").parse(date);
		if (currentDate.after(expiry_date)) 
		{
           System.out.println( "raw material expired");
        } 
		else if (currentDate.before(expiry_date)) 
		{
            System.out.println("raw material is not expired till now");
        } 
		else
		{
            System.out.println("raw material expired");
        }
		return false;
	}

	@Override
	public String updateRawMaterialStock(RawMaterialStock rawMaterialStock) {
		
		if(rawMaterialStock.getOrderId() == null)
		{
			throw new IncorrectIdException("Invalid order Id");
		}
		
		return rawMaterialStock.getWarehouseID();
		
	}

	@Override
	public boolean doesRawMaterialOrderIdExistinStock(String orderId) {
		dao.doesRawMaterialOrderIdExistinStock(orderId);
		return false;
	}

	@Override
	public void addRawMaterial(RawMaterialStock rawMaterialStock) {
		
		dao.addRawMaterial( rawMaterialStock);
		
	}

}
