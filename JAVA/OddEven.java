import java.util.Scanner;
public class OddEven {
    public static void main(String[]args){
        System.out.println("This program is to calculate if the number is odd or even without using 2");
        System.out.println("To do this we use bitwise '&' operator ");
        System.out.println("Enter an integer value");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if((num&1)==0){
            System.out.println("This is an even integer");

        }else {
            System.out.println("This is an odd integer");
        }



    }
}
