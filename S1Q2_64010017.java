import java.util.Scanner;

public class S1Q2_64010017 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] Characternumbers = { { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" },
                { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" } };
        System.out.print("Random characters are : ");

        int Ran = (int) (Math.random() * 2);
        for (int k = 0; k <=9 ; k++) {
            int temp = (int) (Math.random() * 10);
            while (Characternumbers[Ran][temp] == "x") {
                temp = (int) (Math.random() * 10);
            }
            System.out.print(Characternumbers[Ran][temp] + " ");
            Characternumbers[Ran][temp] = "x";
            Ran++;
            Ran %= 2;
        }

        System.out.println();
        System.out.print("Select group of characters [1]character [2]numeric : ");

        int input = in.nextInt();
        if (input == 1) {
            System.out.print("Characters not in the list are : ");
            for(int i=0;i<=9;i++){
                if(Characternumbers[0][i]!="x");
                System.out.print(Characternumbers[0][i]+" ");
            
            }
        } else if (input == 2) {
            System.out.print("Characters not in the list are : ");
            for(int j=0;j<=9;j++){
                if(Characternumbers[1][j]!="x")
                System.out.print(Characternumbers[1][j]+" ");
        } 
    }
        System.out.println();
        System.out.print("End of program.");
        in.close();
    }
}
