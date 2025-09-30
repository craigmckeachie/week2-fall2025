package com.pluralsight;

public class SubstringExample {
    public static void main(String[] args) {
        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-");
        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition + 1);
        System.out.println(vendor);
        System.out.println(productNum);


    }
}
