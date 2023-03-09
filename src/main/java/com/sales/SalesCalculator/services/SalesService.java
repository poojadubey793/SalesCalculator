package com.sales.SalesCalculator.services;

import com.sales.SalesCalculator.models.VendorSales;

import java.util.HashMap;
import java.util.Map;

public class SalesService {
    public Map<Integer, Double>calculateSales(VendorSales[] vendorSale){
        Map<Integer, Double> sales=new HashMap<>();
        for(VendorSales vendorsales : vendorSale ){
            int vendorId= vendorsales.getVendorId();
            double salesAmount= vendorsales.getSalesAmount();
            if(sales.containsKey(vendorId)){
                salesAmount += sales.get(vendorId);
            }
            sales.put(vendorId, salesAmount);
        }
        return sales;
    }
}
