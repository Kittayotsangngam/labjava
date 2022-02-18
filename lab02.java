import java.util.Scanner;

public class lab02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter c: ");
        double c = in.nextDouble();
        System.out.print("Enter d: ");
        double d = in.nextDouble();
        System.out.print("Enter e: ");
        double e = in.nextDouble();
        System.out.print("Enter f: ");
        double f = in.nextDouble();

        double x;
        double y;

        x=((e*d)-(b*f))/((a*d)-(b*c));
        y=((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println(a+"x " + "+ "+ b +"y = " + e);
        System.out.println(c+"x " + "+ "+ d +"y = " + f);

        System.out.println("Value of x = "+ x);
        System.out.println("Value of y = "+ y);
        in.close();

    }
    
}
