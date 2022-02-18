import java.util.Scanner;

public class lab203 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity = in.nextLine();

        System.out.print("Enter the second city: ");
        String secondCity = in.nextLine();

        System.out.print("Enter the third city: ");
        String thirdCity = in.nextLine();

        if(firstCity.compareTo(secondCity)<=0&&firstCity.compareTo(thirdCity)<=0)
        {
            if(secondCity.compareTo(thirdCity)<=0)
            {
                System.out.print("The three cities in alphabetical order are" + " " + firstCity + " " + secondCity + " " + thirdCity);
            }
            else
            {
                System.out.print("The three cities in alphabetical order are" + " " + firstCity + " " + thirdCity + " " + secondCity);
            }
        }
        else if(secondCity.compareTo(firstCity)<=0&&secondCity.compareTo(thirdCity)<=0)
        {
            if(firstCity.compareTo(thirdCity)<=0)
            {
                System.out.print("The three cities in alphabetical order are" + " " + secondCity + " " + firstCity + " " + thirdCity);
            }
            else
            {
                System.out.print("The three cities in alphabetical order are" + " " + secondCity + " " + thirdCity + " " + firstCity);
            }
        }
        else
        {
            if(firstCity.compareTo(secondCity)<=0)
            {
                System.out.print("The three cities in alphabetical order are" + " " + thirdCity + " " + firstCity + " " + secondCity);
            }
            else
            {
                System.out.print("The three cities in alphabetical order are" + " " + thirdCity + " " + secondCity + " " + firstCity);
            }
        }in.close();
    }
}