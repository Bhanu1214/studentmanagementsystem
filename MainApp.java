package com.student.main;

import com.student.service.StudentService;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 : service.addStudent();
                case 2 : service.viewStudents();
                case 3 : service.searchStudent();
                case 4 : service.deleteStudent();
                case 5 : {
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                }
                default : System.out.println("Invalid choice!");
            }
        }
    }
}
