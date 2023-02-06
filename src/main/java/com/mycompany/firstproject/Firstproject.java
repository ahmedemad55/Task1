/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.firstproject;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Firstproject {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
Scanner in =new Scanner(System.in);

         System.out.println("Enter number of your numbers : ");
         int numbers=in.nextInt();
           if (numbers<=0){
                System.out.println("Invailed number");}
          double max = 0 ;
          double min = 0  ;
          int i =1 ;
            while(  i++<=numbers) {
               System.out.println("Enter numbers");         
                 int x=in.nextInt() ;
           if(x>max){
               max=x;}
           else if(x<min){
           min=x;}
           if(max==0||min==0){
               max=min=x ;}
            }
            System.out.println("min is :"+min);
             System.out.println("max is :"+max);    
             
           
          double diff=max-min ;
           if (diff-0.5*max<0  ){
             System.out.println("Dangerous zone");
            }
           else if (diff-0.5*max>=0){
             System.out.println("Safe zone");
                   }     
           
           }
           
        }
        

          
          
          
          
        