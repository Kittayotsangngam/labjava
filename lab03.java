import java.util.Scanner;

public class lab03 {
    public static void main(String[] args) {
        System.out.print("Enter a number between 0 and 1000: ");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt(); 

        int temp1;
        int temp2;
        int Ans;

        if(input>0&&input<1000)
        {
            Ans = input%10 ;
            temp1 = (input%100) ;
            Ans += temp1/10;
            temp2 =input/100;
            Ans += temp2;
            System.out.println("The sum of the digits is " + Ans);
        }
        else 
        {
            System.out.println("Error");
        }
        in.close();
    }
    
}
