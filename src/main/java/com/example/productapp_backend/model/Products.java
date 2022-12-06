package com.example.productapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue
    private int product_code;
    private String  product_name;
    private String  manu_date;
    private String exp_date;
    private String brand;
    private int price;
    private String celler_name;
    private String distributor_name;


    public Products() {
    }

    public Products(int product_code, String product_name, String manu_date, String exp_date, String brand, int price, String celler_name, String distributor_name) {
        this.product_code = product_code;
        this.product_name = product_name;
        this.manu_date = manu_date;
        this.exp_date = exp_date;
        this.brand = brand;
        this.price = price;
        this.celler_name = celler_name;
        this.distributor_name = distributor_name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getManu_date() {
        return manu_date;
    }

    public void setManu_date(String manu_date) {
        this.manu_date = manu_date;
    }

    public String getExp_date() {
        return exp_date;
    }

    public void setExp_date(String exp_date) {
        this.exp_date = exp_date;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCeller_name() {
        return celler_name;
    }

    public void setCeller_name(String celler_name) {
        this.celler_name = celler_name;
    }

    public String getDistributor_name() {
        return distributor_name;
    }

    public void setDistributor_name(String distributor_name) {
        this.distributor_name = distributor_name;
    }
}
