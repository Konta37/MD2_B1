package ra.session01;

public class VariableDemo {

    public static void main(String[] args) {
        int a = 10;
        //Khai báo biến lưu trữ mã sinh viên, tên sinh viên, tuổi, điểm sinh viên.
        String studentID;
        String studenName;
        int age;
        float mark;

        //Khởi tạo giá trị cho các biến mã sinh viên, tên sv, tuổi, điểm
        studentID = "SV001";
        studenName = "Nguyễn Văn A";
        age = 20;
        mark = 5.5F; //nên để F chứ ko phải f

        //Khai báo và khởi tạo giá trị cho biến địa chỉ, số điện thoại, giới tính sv
        String address = "Hà Nội";
        String phone = "0339389369";
        boolean sex = true; //true là nam

        //khai báo và khởi tạo cho nhiều biến cùng kiểu dữ liệu
        int firstNumber = 5, secondNumber = 10;

        //syntax khai báo biến hằng số: final datatype constantName = Value;
        //Quy tắc đặt tên hằng số: Viết hoa + Snake
        final float MARK_PASS = 50; //Ko thể gán lại gtri
    }
}
