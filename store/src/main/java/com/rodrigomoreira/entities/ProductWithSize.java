package com.rodrigomoreira.entities;

public class ProductWithSize extends Product {

    private char size;

    public ProductWithSize(String name, Integer code, double price, char size) {
        super(name, code, price);
        this.size = size;
    }

    public ProductWithSize(Integer code, char size) {
        super(code);
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + size;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProductWithSize other = (ProductWithSize) obj;
        if (size != other.size)
            return false;
        return true;
    }

}
