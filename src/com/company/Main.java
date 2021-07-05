package com.company;


import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {



        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entr 1st string :: " );
        String s1 = sc.nextLine();//"prajakta";
        System.out.println("Entr 2nd string :: " );
        String s2 = sc.nextLine();
        System.out.println("Letters of 1st string are :: ");

      //  myclass m=new myclass();
       // m.rev(s2,s1);
        for (int i = 0; i < s1.length(); i++) {
            System.out.print( s1.charAt(i) +"  ");
        }
        System.out.println();
        System.out.println("================================================================");

        System.out.println("Letters of 1st string are :: ");
        for (int i = 0; i < s2.length(); i++)
        {
            System.out.print( s2.charAt(i) +" ");
        }
        System.out.println("================================================================");

        myclass m=new myclass();
         m.rev(s2,s1);
    }
}