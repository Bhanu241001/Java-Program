import java.util.Scanner;
public class BigSmall {
    public static void main(String[]args){
        System.out.println("This program will check which of the given  number by user is greater than another number  ");
        System.out.println("Enter first number :");
        Scanner sc =new Scanner(System.in);
        int num_1=sc.nextInt();
        System.out.println("Enter a second number");
        int num_2=sc.nextInt();
        System.out.println("Enter a third number");
        int num_3=sc.nextInt();
        if(num_1>num_2 && num_1>num_3){
            System.out.println(num_1+" is greater than "+num_2+" and "+num_3+" numbers");
            if(num_2>num_3){
                System.out.println(num_2+" is greater than "+num_3);
                System.out.println(num_3+" is smallest number");
            } else if (num_3>num_2) {
                System.out.println(num_3+" is greater than "+num_2);
                System.out.println(num_2+" is smallest number");
            }
        } else if (num_2>num_1 && num_2>num_3) {

            System.out.println(num_2+" is grater than "+num_1+" and "+num_3+" numbers");
            if(num_1>num_3){
                System.out.println(num_1+" is greater than "+num_3);
                System.out.println(num_3+" is smallest number");
            } else if (num_3>num_1) {
                System.out.println(num_3+" is greater than "+num_1);
                System.out.println(num_1+" is smallest number");
            }
        }
        else{
            System.out.println(num_3+" is greater than "+num_1+" and "+num_2+" numbers");
            if(num_1>num_2){
                System.out.println(num_1+" is greater than "+num_2);
                System.out.println(num_2+" is smallest number");
            } else if (num_2>num_1) {
                System.out.println(num_2+" is greater than "+num_1);
                System.out.println(num_1+" is smallest number");
            }
        }


    }
}
