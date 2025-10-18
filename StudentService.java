package com.student.service;

import com.student.model.Student;
import java.util.*;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        students.add(new Student(id, name, age, course));
        System.out.println("✅ Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        System.out.println("\n--- Student List ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudent() {
        System.out.print("Enter Student ID to search: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("Student Found: " + s);
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            if (s.getId() == id) {
                it.remove();
                System.out.println("✅ Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
