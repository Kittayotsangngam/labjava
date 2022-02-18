import java.util.Scanner;
public class lab303{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = input.nextInt();
        int[][] m = new int[size][size];

        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                m[i][k] = (int)(Math.random() * 2);
            }
        }
        System.out.println("");
        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                System.out.print(m[i][k]);
            }
            System.out.println("");
        }
        int column = 0;
        int row = 0;
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < m.length; i++) {
                if (rowSequence(m,k,i)) {
                    System.out.println("All " + k + "s on row " + i);
                    row++;
                }
            }

        }
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < m.length; i++) {
                if (columnSequence(m,k,i)) {
                    System.out.println("All " + k + "s on column " + i);
                    column++;
                }
            }

        }
        if (column == 0) {
            System.out.println("No same numbers on a column");
        }
        if (row == 0) {
            System.out.println("No same numbers on a row");
        }
        if(!superDiagonal(m, 0)&&!superDiagonal(m, 1))
        {
            System.out.printf("No same numbers on the superdiagonal\n");
        }
        else if(superDiagonal(m, 0)&&!superDiagonal(m, 1))
        {
            System.out.printf("All 0s on superdiagonal\n");
        }
        else if(!superDiagonal(m, 0)&&superDiagonal(m, 1))
        {
            System.out.printf("All 1s on superdiagonal\n");
        }
        if(!Diagonal(m, 0)&&!Diagonal(m, 1))
        {
            System.out.printf("No same numbers on the diagonal\n");
        }
        else if(Diagonal(m, 0)&&!Diagonal(m, 1))
        {
            System.out.printf("All 0s on diagonal\n");
        }
        else if(!Diagonal(m, 0)&&Diagonal(m, 1))
        {
            System.out.printf("All 1s on diagonal\n");
        }
        if(!subDiagonal(m, 0)&&!subDiagonal(m, 1))
        {
            System.out.printf("No same numbers on the subdiagonal\n");
        }
        else if(subDiagonal(m, 0)&&!subDiagonal(m, 1))
        {
            System.out.printf("All 0s on subdiagonal\n");
        }
        else if(!subDiagonal(m, 0)&&subDiagonal(m, 1))
        {
            System.out.printf("All 1s on subdiagonal\n");
        }
        input.close();
    }
    public static boolean rowSequence(int[][] m, int n, int row) {

        for (int k = 0; k < m[row].length; k++) {
            if (m[row][k] != n) return false;
        }
        return true;
    }

    public static boolean columnSequence(int[][] m, int n, int column) {

        for (int i = 0; i < m.length; i++) {
            if (m[i][column] != n) return false;
        }
        return true;
    }
    public static boolean Diagonal(int[][] m, int n) {

        boolean topLeftDown = true; 

        for (int i = 0; i < m.length; i++) {
            if (m[i][i] != n) topLeftDown = false;
        }

        boolean bottomLeftDown = true; 

        int k = 0;
        for (int i = m.length - 1; i >= 0; i--) {
                if (m[i][k++] != n) bottomLeftDown = false;

        }

        return topLeftDown || bottomLeftDown;
    }



    public static boolean subDiagonal(int[][] m, int n) {



        for (int i = 1; i < m.length; i++) {
            if (n != m[i][i-1]) return false;
        }

        return true;
    }

    public static boolean superDiagonal(int[][] m, int n) {


        for (int i = 0; i < m.length - 1; i++) {
            if (n != m[i][i+1]) return false;
        }

        return true;
    }
    
}
