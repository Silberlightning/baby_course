package org.example;

import org.example.task1.Book;
import org.example.task1.Student;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setBook("Krut'","Pelevin",2024);
        book1.print();

        Student student1 = new Student();
        student1.setName("Markus");
        student1.setNote(3.3);
        student1.setNumber(2024);
        student1.print();
    }
}