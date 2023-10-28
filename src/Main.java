import entities.Bill;
import service.BillService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Bill> bills = new ArrayList<>();
        BillService billService = new BillService();
        billService.inputBill(scanner, bills);
        billService.display(bills);
    }
}
