import java.util.Scanner;

class division{
    public static void main(String args[]){
        float division;

        Scanner sc= new Scanner(System.in);
        float x= sc.nextFloat();
        
        Scanner myobjscanner= new Scanner(System.in);
        float y= sc.nextFloat();

        division=x/y;

        System.out.println(division);

    }
}