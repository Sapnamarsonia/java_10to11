package com.controller;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.example.model.Author;
import com.example.model.Book;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Session sess = new Util().getconnect();
        Transaction tr = sess.beginTransaction();

        try {
            // Input
            System.out.println("Enter Author Name:");
            String authorName = sc.nextLine();

            System.out.println("Enter Book 1 Title:");
            String book1Title = sc.nextLine();

            System.out.println("Enter Book 2 Title:");
            String book2Title = sc.nextLine();

            // Create author and books
            Author author = new Author();
            author.setName(authorName);

            Book book1 = new Book();
            book1.setTitle(book1Title);

            Book book2 = new Book();
            book2.setTitle(book2Title);

            // Set relationships
            author.addBook(book1); // sets author in book too
            author.addBook(book2);

            // Save only the author (books will be saved due to CascadeType.ALL)
            sess.save(author);

            tr.commit();
            System.out.println("Author and books saved successfully!");

        } catch (Exception e) {
            if (tr != null) tr.rollback();
            e.printStackTrace();
        } finally {
            sess.close();
            sc.close();
        }
    }
}
