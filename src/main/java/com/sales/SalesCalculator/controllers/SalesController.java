package com.sales.SalesCalculator.controllers;

import com.sales.SalesCalculator.models.VendorSales;
import com.sales.SalesCalculator.services.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class SalesController {
    @Autowired
    private SalesService salesService;

    @GetMapping("/sales")
    public Map<Integer, Double>getSales(){
        VendorSales[] vendorSale={
                new VendorSales(1, "vendor1", 1000),
                new VendorSales(2, "vendor2", 2000),
                new VendorSales(3, "vendor3", 3000),
                new VendorSales(1, "vendor1", 1500),
                new VendorSales(3, "vendor3", 2000),
                new VendorSales(2, "vendor2", 1500),
                new VendorSales(4, "vendor4", 3000)
        };
        return salesService.calculateSales(vendorSale);
    }
}
