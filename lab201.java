import java.util.Scanner;

public class lab201 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int today = in.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int nextday = in.nextInt();
        int nextdaytemp = (today+nextday)%7;

        if(today>=0&&today<=6){
        if(today==0)
        {
            System.out.print("Today is Sunday and ");
        }
        else if(today==1)
        {
            System.out.print("Today is Monday and ");
        }
        else if(today==2)
        {
            System.out.print("Today is Tuesday and ");
        }
        else if(today==3)
        {
            System.out.print("Today is Wednesday and ");
        }
        else if(today==4)
        {
            System.out.print("Today is Thursday and ");
        }
        else if(today==5)
        {
            System.out.print("Today is Friday and ");
        }
        else if(today==6)
        {
            System.out.print("Today is Saturday and ");       
        }
        
        if(nextdaytemp==0)
        {
            System.out.print("the future day is Sunday");
        }
        else if(nextdaytemp==1)
        {
            System.out.print("the future day is Monday");
        }
        else if(nextdaytemp==2)
        {
            System.out.print("the future day is Tuesday");
        }
        else if(nextdaytemp==3)
        {
            System.out.print("the future day is Wednesday");
        }
        else if(nextdaytemp==4)
        {
            System.out.print("the future day is Thursday");
        }
        else if(nextdaytemp==5)
        {
            System.out.print("Tthe future day is Friday");
        }
        else if(nextdaytemp==6)
        {
            System.out.print("the future day is Saturday");       
        }
    }
        in.close();

    }
}
