package HomeWork;
import java.util.ArrayList;

import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Student[] arr;
        arr = new Student[2];
        arr[0] = new Student(1,"Nguyen Duc anh",24,"0339389369","ducanhbg3700@gmail.com");
        arr[1] = new Student(1,"Nguyen Duc anh",24,"0339389369","ducanhbg3700@gmail.com");
        System.out.printf("%50s%n","DANH SACH SINH VIEN");
        System.out.println("|-----|----------------------|-------|-----------------|--------------------------------|");
        System.out.printf("| %-3s | %-20s | %-5s | %-15s | %-30s |%n", "STT", "Ho va ten", "Tuoi", "So dien thoai", "Email");

        // Optionally, print the students' information to verify
        for (int i=0; i< arr.length ; i++) {
            System.out.printf("| %-3d | %-20s | %-5d | %-15s | %-30s |%n",
                    arr[i].id, arr[i].name, arr[i].age, arr[i].phoneNumber, arr[i].email);
        }    }

    
}
class Student{
    public int id;
    public String name;
    public int age;
    public String phoneNumber;
    public String email;
    // Constructor
    public Student(int id, String name, int age, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
