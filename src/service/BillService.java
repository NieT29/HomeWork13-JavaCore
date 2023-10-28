package service;

import entities.Bill;
import entities.Customer;
import utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class BillService {
    Utils utils = new Utils();

    public void inputBill(Scanner scanner, ArrayList<Bill> bills) {
        System.out.println("Nhập số hộ dân: ");
        int n = utils.inputInt(scanner);

        for (int i = 0; i < n; i++) {
            Bill bill = new Bill(scanner);
            System.out.println("Nhập số điện cũ");
            bill.setOldNumberElectric(utils.inputInt(scanner));
            System.out.println("Nhập số điện mới");
            bill.setNewNumberElectric(utils.inputInt(scanner));
            bill.price();
            bills.add(bill);
        }
    }

    public void display(ArrayList<Bill> bills) {
        for (int i = 0; i < bills.size(); i++) {
            System.out.println("Thông tin hộ dân thứ "+(i+1));
            Bill bill = bills.get(i);
            System.out.println(bill);
        }
    }
}
