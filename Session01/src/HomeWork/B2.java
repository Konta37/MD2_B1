package HomeWork;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD cần đổi: ");
        float money = Float.parseFloat(scanner.nextLine());
        float vndMoney = 23000;
        System.out.println("Số tiền theo vnd là: " + (money * vndMoney));

    }
}
