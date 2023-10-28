package entities;

import service.CustomerService;

import java.util.Scanner;

public class Bill {
    private Customer customer;
    private int oldNumberElectric;
    private int newNumberElectric;



    public Bill(Scanner scanner) {
        CustomerService customerService = new CustomerService();
        this.customer = customerService.inputCustomer(scanner);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldNumberElectric() {
        return oldNumberElectric;
    }

    public void setOldNumberElectric(int oldNumberElectric) {
        this.oldNumberElectric = oldNumberElectric;
    }

    public int getNewNumberElectric() {
        return newNumberElectric;
    }

    public void setNewNumberElectric(int newNumberElectric) {
        this.newNumberElectric = newNumberElectric;
    }

    public double price() {
        return (newNumberElectric-oldNumberElectric) * 750;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + customer +
                ", oldNumberElectric=" + oldNumberElectric +
                ", newNumberElectric=" + newNumberElectric +
                ", price=" + price() +
                '}';
    }
}
