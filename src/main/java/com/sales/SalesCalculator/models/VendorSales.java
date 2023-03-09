package com.sales.SalesCalculator.models;

public class VendorSales {
    private int vendorId;
    private String vendorName;
    private double salesAmount;

    public VendorSales(int vendorId, String vendorName, double salesAmount) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.salesAmount = salesAmount;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
}
