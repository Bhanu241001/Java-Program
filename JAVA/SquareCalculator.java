import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[]args){
         Scanner sc= new Scanner(System.in);
        System.out.println("This program is to calculate the area and perimeter of the square ");
        System.out.println("Enter the side of the square");
        int side=sc.nextInt();
        int area=side*side;
        int perimeter=4*side;
        System.out.println("Side of the square is "+side);
        System.out.println("Area of the square is "+area);
        System.out.println("Perimeter of the square "+perimeter);
    }
}
