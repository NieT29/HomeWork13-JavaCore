package service;

import entities.Customer;
import utils.Utils;

import java.util.Scanner;

public class CustomerService {
    Utils utils = new Utils();
    Customer customer = new Customer();

    public Customer inputCustomer(Scanner scanner) {
        System.out.println("Nhập tên chủ hộ");
        customer.setName(utils.inputString(scanner));
        System.out.println("Nhập số nhà");
        customer.setApartmentNumber(utils.inputInt(scanner));
        System.out.println("Nhập mã công tơ điện");
        customer.setMeterCode(utils.inputInt(scanner));
        return customer;
    }
}
