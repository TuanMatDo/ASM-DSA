package org.example;

import java.util.Random;

public class StudentManagement {
    private StudentStack studentStack;

    // Constructor
    public StudentManagement(int size) {
        studentStack = new StudentStack(size);
    }

    // Add student
    public void addStudent(Student student) {
        studentStack.push(student);
    }

    // Generate random students
    public void generateStudents(int numStudents) {
        Random rand = new Random();
        for (int i = 1; i <= numStudents; i++) {
            String name = "Student " + i;
            int age = 18 + rand.nextInt(5);
            double score = 5 + rand.nextDouble() * 5; // Score between 5 and 10
            Student student = new Student(i, name, age, score);
            addStudent(student);
        }
    }

    // Bubble Sort by score
    public void bubbleSortByScore() {
        long startTime = System.nanoTime(); // Start time for BubbleSort
        for (int i = 0; i < studentStack.getSize() - 1; i++) {
            for (int j = 0; j < studentStack.getSize() - i - 1; j++) {
                Student student1 = studentStack.findStudentById(j);
                Student student2 = studentStack.findStudentById(j + 1);

                if (student1 != null && student2 != null) {
                    if (student1.getScore() < student2.getScore()) {
                        // Swap
                        studentStack.swap(j, j + 1);
                    }
                }
            }
        }
        long endTime = System.nanoTime(); // End time for BubbleSort
        System.out.println("BubbleSort time: " + (endTime - startTime) + " nanoseconds");
    }

    // QuickSort by score
    public void quickSortByScore(int low, int high) {

        if (low < high) {
            int pi = partition(low, high);
            quickSortByScore(low, pi - 1);
            quickSortByScore(pi + 1, high);
        }


    }

    private int partition(int low, int high) {
        double pivot = studentStack.findStudentById(high).getScore();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            Student student = studentStack.findStudentById(j);
            if (student != null && student.getScore() >= pivot) {
                i++;
                studentStack.swap(i, j);
            }
        }
        studentStack.swap(i + 1, high);
        return i + 1;
    }

    // Display all students in the stack
    public void displayAllStudents() {
        studentStack.displayAllStudents();
    }

    // Get the size of the stack
    public int getSize() {
        return studentStack.getSize();
    }
}
