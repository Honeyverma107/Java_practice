//leap year

import java.util.*;
public class leapyear{
    public static void main (String[] args){


        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x);

        if(x%4==0){
            System.out.println("leap year");
        }else if(x%400==0){
            System.out.println("leap year");

        }else if(x%100==0){
            System.out.println("leap year");

        }else if(x%10==0){

            System.out.println("leap year");

        }else{
            System.out.println(" not leap year");

        }

        
    }
}