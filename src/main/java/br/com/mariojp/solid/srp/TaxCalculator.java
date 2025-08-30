package br.com.mariojp.solid.srp;

public class TaxCalculator {
    public double getTaxRate() {
        System.setProperty("tax.rate", "0.08");
        String value = System.getProperty("tax.rate");
        return Double.parseDouble(value);
    }

    public double calculateTax(double subtotal) {
        return subtotal * getTaxRate();
    }
}
