package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create StudentManagement object
        StudentManagement management1 = new StudentManagement(2000);
        StudentManagement management2 = new StudentManagement(2000);

        // Add students
//        for( int i=1 ;i<=10000 ;i++){
//            Student student1 = new Student(i , "dao anh tuan "+i, 20, new Random().nextInt(100));
//            management1.addStudent(student1);
//            management2.addStudent(student1);
//        }
        management1.generateStudents(2000);
        management2.generateStudents(2000);




        // Display students before sorting
//        System.out.println("Danh sách sinh viên trước khi sắp xếp:");
//        management.displayAllStudents();

        // Bubble Sort by score
//        management.bubbleSortByScore();
//
//        // Display students after BubbleSort
//        System.out.println("\nDanh sách sinh viên sau khi sắp xếp BubbleSort:");
//        management.displayAllStudents();
//
//        // QuickSort by score
//        management.quickSortByScore(0, management.getSize() - 1);
//
//        // Display students after QuickSort
//        System.out.println("\nDanh sách sinh viên sau khi sắp xếp QuickSort:");
//        management.displayAllStudents();
        management1.bubbleSortByScore();
        long startTime = System.nanoTime(); // Start time for QuickSort
        management2.quickSortByScore(0, management2.getSize() - 1);
        long endTime = System.nanoTime(); // End time for QuickSort
        System.out.println("QuickSort time: " + (endTime - startTime) + " nanoseconds");
    }
}

