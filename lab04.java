import java.util.Scanner;
public class lab04 {
    public static void main(String[] args) {
        System.out.print("Enter weight in pounds: ");
        Scanner in = new Scanner(System.in);
        double Weight = in.nextDouble(); 
        System.out.print("Enter height in inches: ");
        double Height = in.nextDouble(); 
        double BMI;

        Weight=Weight*0.45359237;
        Height=Height*0.0254;

        BMI=Weight/(Height*Height);

        System.out.println("BMI is " + BMI);

        in.close();
    }
}
