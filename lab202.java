import java.util.Random;
import java.util.Scanner;

public class lab202 {    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int Human = in.nextInt();

        Random rand = new Random();
        int randnumber = rand.nextInt(2)+1;

        if(Human==0&&randnumber==0)
        {
            System.out.print("The computer is scissor. You are scissor too. It is a draw");
        }
        if(Human==1&&randnumber==1)
        {
            System.out.print("The computer is rock. You are rock too. It is a draw");
        }
        if(Human==2&&randnumber==2)
        {
            System.out.print("The computer is paper. You are paper too. It is a draw");
        }
        if(Human==0&&randnumber==2)
        {
            System.out.print("The computer is paper. You are scissor. You won");
        }
        if(Human==1&&randnumber==0)
        {
            System.out.print("The computer is scissor. You are rock. You won");
        }
        if(Human==2&&randnumber==1)
        {
            System.out.print("The computer is rock. You are paper. You won");
        }
        if(Human==0&&randnumber==1)
        {
            System.out.print("The computer is rock. You are scissor. You lose");
        }
        if(Human==1&&randnumber==2)
        {
            System.out.print("The computer is paper. You are rock. You lose");
        }
        if(Human==2&&randnumber==0)
        {
            System.out.print("The computer is scissor. You are paper. You lose");
        }
        in.close();
    }
}
