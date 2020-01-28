/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account_System;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Library {
    int n =3;
    Book books[] = new Book[5];
    Author authors[] = new Author[n];
    
    public void initialize()
    {
        Author humayon = new Author("Prof Humayon Ahmed", "hu@yahoo.com", 'M');
        Author rudro_shohidullah = new Author("Rudro Sohidullah", "rs@gmail.com", 'M');
        Author deital = new Author("P Deital", "deital@ck.com.ca", 'F');
        Author mazhar = new Author("Mazhar Rahman", "mr@live.com", 'M');
        
        authors[0] = rudro_shohidullah;
        authors[1] = humayon;
        authors[2] = deital;
        authors[3] = mazhar;
        
        Author [] deyal_authors = {authors[1], authors[3]};
        Author [] misir_authors = {authors[1]};
        
        Book literature1 = new Book("Deyal", deyal_authors, 150, 5);
        Book literature2 = new Book("Misir Alir Choshma", misir_authors, 120);
        Book academic1 = new Book("How to Program: Java", authors, 250, 10);
        
        books[0] = literature1;
        books[1] = literature2;
        books[2] = academic1;
        
        showData(books);
    }
    
    public void showData(Book[] books_array){
        String book_info = "";
        for(Book book_data: books_array){
            book_info += book_data + "\n";
        }
        
        JOptionPane.showMessageDialog(null, book_info);
    }
    
    public void borrow(){
        
    }
    
    public Book findBook(String desired_name, Book[] books_array){
        for(Book book_data: books_array){
            if (book_data.getName().equalsIgnoreCase(desired_name))
                return book_data;
        }
        
        return null;
    }
    
    public void search(){
        String desired_name = JOptionPane.showInputDialog("Enter your desired book: ");
        
        Book desired_book = findBook(desired_name, books);
        
        JOptionPane.showMessageDialog(null, desired_book);
    }
    
}
