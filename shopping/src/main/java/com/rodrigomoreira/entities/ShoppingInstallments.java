package com.rodrigomoreira.entities;

public class ShoppingInstallments extends Shopping{

    private Integer installment; 
    private Double fees;

    public ShoppingInstallments(Double price, Integer installment, Double fees) {
        super(price);
        this.installment = installment;
        this.fees = fees;
    }

    public ShoppingInstallments(){
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * Math.pow((1 + fees/100), installment);
    }

    public Integer getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }
    
}
