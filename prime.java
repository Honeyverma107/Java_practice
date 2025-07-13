//checking prime no.
import java.util.*;
public  class prime{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x);

        if(x%2>=1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }



        
    }
}