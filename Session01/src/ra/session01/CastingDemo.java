package ra.session01;

public class CastingDemo {
    public static void main(String[] args) {
        //Implicit: Ngầm định, ép kiểu dữ liệu tù thấp lên cao
        float number = 10; //int->float
        //Explicit: Tường minh, ép kiểu dữ liệu từ cao xuống thấp (người lập trình phải ép kiểu)
        float hello = 8.9F;
        int secondNumber = (int)8.9;
        System.out.println(hello + " " + secondNumber);
    }
}
