import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner bien = new Scanner(System.in);
        System.out.println("a:");
        double a = bien.nextDouble();
        System.out.println("b:");
        double b = bien.nextDouble();
        double x;
        if (a == 0) {
            System.out.println("pt vô nghiệm");
        }
        if (a != 0) {
            x = (-b) / a;
            System.out.println("x= %.2f"+x);
        }
         

    }
    
}
