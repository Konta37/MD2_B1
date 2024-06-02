package ra.session01;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {

//        1. Bước 1: Khởi tạo đối tượng scanner từ lớp java.util.Scanner
//        2. Bước 2: Thông báo nhập dữ liệu
//        3. Bước 3: Sử dụng các phương thức của lớp Scanner lấy dữ liệu
//        Nhập từ bàn phím lưu vào biến

//        Nhập mã sinh viên
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên: ");
        String studentID = scanner.nextLine();
        //2 nhập vào tên sv
        System.out.println("Nhập vào tên sv: ");
        String studentName = scanner.nextLine();

        /*
         * String --> int: Interger.parseInt("String")
         * String --> float: Float.parseFloat("String")
         * String --> doublt: Float.parseDouble("String")
         * String --> boolean: Boolean.parseBoolean("String");
         * */
        //3 nhập vào tuổi sinh viên
        System.out.println("Nhập vào tuổi sv");
//        int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());
//        scanner.nextLine();
        //4. Nhập vào địa chỉ sv
        System.out.println("Nhập vào địa chỉ sinh viên: ");
        String address = scanner.nextLine();
        //ko được nhập adress vì đang đọc phím Enter. Để fix thêm câu lệnh ở dưới age
        // 5. Nhập vào giới tính sinh viên (F-Female, M-Male)
        System.out.println(("Nhập vào giới tinh sinh viên:"));
        char sex = scanner.next().charAt(0);


        System.out.println("Mã sinh viên: " + studentID);
        System.out.println("Tên sinh viên: " + studentName);
        System.out.println("Tuổi sinh viên: " + age);
        System.out.println("Địa chỉ sinh viên: " + address);
        System.out.println("Giới tính sinh viên: " + sex);

    }
}
