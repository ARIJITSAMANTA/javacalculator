import java.util.Scanner;

//input n1,n2-->(select operation)result
import java.util.*;
public class Calculator{

    public static void main(String args[]){
        int n1,n2,ch,cal;
        System.out.println("enter two numner =");
        Scanner sc=new Scanner(System.in);
         n1=sc.nextInt();
         n2=sc.nextInt();
         System.out.println("Seelct operation");
         ch=sc.nextInt();
         if(ch==1){
            cal=n1+n2;
            System.out.println("Addition"+cal);
         }
         else if(ch==2){
            cal=n1-n2;
            System.out.println("Subtraction"+cal);

         }
         else if(ch==3){
            cal=n1*n2;
            System.out.println("Multiplication"+cal);
         }
         else if(ch==4){
            cal=n1/n2;
            System.out.println("Division"+ cal);


         }
         else{
            cal=n1%n2;
            System.out.println("remainder"+cal);

         }
    }
}