package com.capg.inventoryms.exception;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException(String msg){
        super(msg);
    }
}
