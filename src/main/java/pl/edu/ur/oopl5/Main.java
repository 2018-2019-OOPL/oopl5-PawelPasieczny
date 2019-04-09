package pl.edu.ur.oopl5;

import java.util.Scanner;
import pl.edu.ur.oopl5.book.book;
import pl.edu.ur.oopl5.date.MyDate;
import pl.edu.ur.oopl5.stack.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Zad 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cene ksi¹¿ki 1: ");
        int p1 = sc.nextInt();
        
        book b = new book("Przyk³adowy tytu³", "przyk³adowy autor", 56, 1993, p1);
        b.showData();
        
        System.out.println("Zad 4");
        
        MyDate md = new MyDate();
                
    }

}
