package HomeWork;

import java.util.Scanner;

public class B6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm môn Toán: ");
        double scoreMath = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm môn Anh: ");
        double scoreEnglish = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập điểm môn Văn: ");
        double scoreLiterature = Double.parseDouble(sc.nextLine());
        double averageScore = (scoreMath + scoreEnglish + scoreLiterature)/3;
        System.out.printf(" Điểm trung bình 3 môn Toán, Văn, Anh là: %.2f",averageScore);
    }
}
