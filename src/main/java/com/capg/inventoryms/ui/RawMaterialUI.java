package com.capg.inventoryms.ui;

import com.capg.inventoryms.dao.RawMaterialDaoImpl;
import com.capg.inventoryms.entities.RawMaterialStock;
import com.capg.inventoryms.exception.IncorrectIdException;
import com.capg.inventoryms.service.RawMaterialService;
import com.capg.inventoryms.service.RawMaterialServiceImpl;

public class RawMaterialUI {
	
	private static RawMaterialService service = new RawMaterialServiceImpl(new RawMaterialDaoImpl());
	
	public static void main(String[] args) {
		
		RawMaterialUI obj = new RawMaterialUI();
		obj.runUi();
	}
	 public void runUi()
	 {
		try {
		RawMaterialStock rawMaterialStock1 = new RawMaterialStock("1","Apple","101");
		RawMaterialStock rawMaterialStock2 = new RawMaterialStock("2","grapes","102");
		RawMaterialStock rawMaterialStock3 = new RawMaterialStock("3","oranges","103");
		//RawMaterialStock s = new RawMaterialStock();
		
		service.addRawMaterial(rawMaterialStock1);
		service.addRawMaterial(rawMaterialStock2);
		service.addRawMaterial(rawMaterialStock3);
		display(rawMaterialStock1);
		}

		catch(IncorrectIdException e)
		{
			System.out.println("incorrect id ");
		}
		catch(Throwable e)
		{
			e.printStackTrace();
			System.out.println("Something went wrong");
		}
	 }

	public void display( RawMaterialStock s)
	{
		System.out.println(s.getWarehouseID());
	}
	 	
}
