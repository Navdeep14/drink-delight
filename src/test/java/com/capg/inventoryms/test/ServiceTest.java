package com.capg.inventoryms.test;

import org.junit.jupiter.api.*;
import java.text.ParseException;
import com.capg.inventoryms.dao.RawMaterialDaoImpl;
import com.capg.inventoryms.entities.RawMaterialStock;
import com.capg.inventoryms.service.RawMaterialServiceImpl;

public class ServiceTest {

	RawMaterialServiceImpl service;

	@BeforeEach
	public void setup() {
		service = new RawMaterialServiceImpl(new RawMaterialDaoImpl());
	}

	@AfterEach
	public void clear() {
		RawMaterialDaoImpl.store.clear();
	}

	@Test
	public void testCase_1() {
		RawMaterialStock rawMaterialStock = new RawMaterialStock("123", "shreya", 1212, 20, 2, 100, "23456789", null,
				null, null, "equal", null);
		service.addRawMaterial(rawMaterialStock);
		if (RawMaterialDaoImpl.store.containsValue(rawMaterialStock)) {
			Assertions.assertEquals("123", rawMaterialStock.getOrderId());
		}
	}

	@Test
	public void testCase_2() {
		RawMaterialStock rawMaterialStock = new RawMaterialStock("123", "shreya", 1212, 20, 2, 100, "23456789", null,
				null, null, "equal", null);
		service.trackRawMaterialOrder(rawMaterialStock);
		if (RawMaterialDaoImpl.store.containsValue(rawMaterialStock)) {
			Assertions.assertEquals("123", rawMaterialStock.getOrderId());
		}
	}

	@Test
	public void testCase_3() {
		RawMaterialStock rawMaterialStock = new RawMaterialStock("123", "shreya", 1212, 20, 2, 100, "23456789", null,
				null, null, "equal", null);
		service.doesRawMaterialOrderIdExist("123");
		if (RawMaterialDaoImpl.store.containsValue(rawMaterialStock)) {
			Assertions.assertEquals("123", rawMaterialStock.getOrderId());
		}
	}

	@Test
	public void testCase_4() {
		RawMaterialStock rawMaterialStock = new RawMaterialStock("123", "shreya", 1212, 20, 2, 100, "23456789", null,
				null, null, "equal", null);
		service.processDateCheck(rawMaterialStock);
		if (RawMaterialDaoImpl.store.containsValue(rawMaterialStock)) {
			Assertions.assertEquals(null, rawMaterialStock.getProcessDate());
		}
	}

	@Test
	public void testCase_5() {
		RawMaterialStock rawMaterialStock = new RawMaterialStock("123", "shreya", 1212, 20, 2, 100, "23456789", null,
				null, null, "equal", null);
		service.validateManufacturingDate(null);
		if (RawMaterialDaoImpl.store.containsValue(rawMaterialStock)) {
			Assertions.assertEquals(null, rawMaterialStock.getManufacturingDate());
		}
	}

	@Test
	public void testCase_6() {
		RawMaterialStock rawMaterialStock = new RawMaterialStock("123", "shreya", 1212, 20, 2, 100, "23456789", null,
				null, null, "equal", null);
		service.updateRawMaterialStock(rawMaterialStock);
		if (RawMaterialDaoImpl.store.containsValue(rawMaterialStock)) {
			Assertions.assertEquals("123", rawMaterialStock.getOrderId());
		}
	}

	@Test
	public void testCase_7() {
		RawMaterialStock rawMaterialStock = new RawMaterialStock("123", "shreya", 1212, 20, 2, 100, "23456789", null,
				null, null, "equal", null);
		service.doesRawMaterialOrderIdExistinStock("123");
		if (RawMaterialDaoImpl.store.containsValue(rawMaterialStock)) {
			Assertions.assertEquals("123", rawMaterialStock.getOrderId());
		}
	}
	
	@Test
	public void testCase_8() throws ParseException
	{
		RawMaterialStock rawMaterialStock = new RawMaterialStock("123", "shreya", 1212, 20, 2, 100, "23456789", null,
				null, null, "equal", null);
		Assertions.assertNull(rawMaterialStock.getProcessDate());
		
	}
}
