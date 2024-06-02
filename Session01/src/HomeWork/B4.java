package HomeWork;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số để tính bình phương: ");
        int number = Integer.parseInt(sc.nextLine());
        System.out.println("bình phương của " + number + " là: " + number*number);
        System.out.println("bình phương của " + number + " là: " + number*number*number);

    }
}
