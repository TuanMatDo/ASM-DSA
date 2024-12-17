package org.example;

public class StudentStack {
    private Student[] students;
    private int size;
    private int top;

    // Constructor
    public StudentStack(int size) {
        this.size = size;
        this.students = new Student[size];
        this.top = -1;
    }

    // Push a student onto the stack
    public void push(Student student) {
        if (top < size - 1) {
            students[++top] = student;
//            System.out.println("Student added: " + student.getName());
        } else {
//            System.out.println("Stack is full.");
        }
    }

    // Pop a student from the stack
    public Student pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return null;
        }
        return students[top--];
    }

    // Peek the top student without removing
    public Student peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return null;
        }
        return students[top];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display all students in the stack
    public void displayAllStudents() {
        if (top == -1) {
            System.out.println("No students in stack.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            students[i].displayInfo();
        }
    }

    // Get the size of the stack
    public int getSize() {
        return top + 1;
    }

    // Find student by ID
    public Student findStudentById(int id) {
        for (int i = 0; i <= top; i++) {
            if (students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    // Swap two students
    public void swap(int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}
