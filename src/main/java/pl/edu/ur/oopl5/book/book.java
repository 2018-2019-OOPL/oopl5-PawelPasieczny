/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.book;

/**
 *
 * @author student
 */
public class book {
    public book() {
        
    }
    private String title;
    private String author;
    private int pages;
    private int year;
    private int price;
    
    public book(String title, String author, int pages, int year, int price){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this. price = price;
    }

    
    
    public void showData(){
        System.out.println("Tytu³: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("Iloœæ stron: " + this.pages);
        System.out.println("Rok wydania: " + this.year);
        System.out.println("Cena: " + this.price + "z³");
}
}
