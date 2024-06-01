import java.util.Scanner;
public class StudentDetails {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your 10th percentage");
        double per=sc.nextDouble();
        System.out.println("Enter your 12th percentage");
        double percent=sc.nextDouble();
        System.out.println("Enter your graduation percentage");
        double percentage=sc.nextDouble();
        System.out.println("Your 10th percentage is :"+ per);
        System.out.println("Your 12th percentage is :"+ percent);
        System.out.println("Your 10th percentage is :"+ percentage);

    }
}
