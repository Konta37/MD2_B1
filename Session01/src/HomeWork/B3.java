package HomeWork;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tinh chu vi va dien tich hinh chu nhat
        float perimeter; //chu vi
        float area; //dien tich
        float lengthRectangle;
        float widthRectangle;
        System.out.println("Nhập vào chiều dài hình chữ nhật: ");
        lengthRectangle = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập vào chiều rộng hình chữ nhật: ");
        widthRectangle = Float.parseFloat(scanner.nextLine());
        perimeter = (lengthRectangle + widthRectangle)*2;
        area = lengthRectangle * widthRectangle;
        System.out.println("Chu vi hình chữ nhật:" + perimeter);
        System.out.println("Diện tích hình chữ nhật:" + area);

    }
}
