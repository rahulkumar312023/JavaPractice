import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the Height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The area is: " +area);

        scanner.close();

    }
}
