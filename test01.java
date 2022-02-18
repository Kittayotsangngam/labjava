import java.util.Scanner;
public class test01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input size of matrix: ");
        int size = input.nextInt();
        if(size>=4){
        int temp = size;
        int[][] m = new int[size][size];

        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                m[i][k] = (int)(Math.random() * 9);
            }
        }
        System.out.println("Random matrix is : ");
        for (int i = 0; i < m.length; i++) {
            for (int k = 0; k < m[i].length; k++) {
                System.out.print(m[i][k]+" ");
            }
            System.out.println("");
        }
        System.out.print("Please input value of Row and Column : ");
        int Row = input.nextInt(); ;
        int Column = input.nextInt();
        int selected =  m[Row][Column];
        System.out.println("The selected member is "+selected);
        System.out.print("(i)Members on Top : ");
        if(Row!=0){
        for(int i=Row-1;i>=0;i--)
        {
            System.out.print(m[i][Column]);
            if(i!=0)
            System.out.print(",");
        }
    }else{ System.out.print("NO");}
        System.out.println();
        System.out.print("(ii)Members on the Right Hand Side : ");
        if(Column!=temp-1){
        for(int i=Column+1;i<=(temp-1);i++)
        {
            System.out.print(m[Row][i]);
            if(i!=temp-1)
            System.out.print(",");
        }
    }else{ System.out.print("NO");}
        System.out.println();
        System.out.print("(iii)Members at the Bottom : ");
        if(Row!=temp-1){
        for(int i=Row+1;i<=(temp-1);i++)
        {
            System.out.print(m[i][Column]);
            if(i!=temp-1)
            System.out.print(",");
        }
    }else{ System.out.print("NO");}
        System.out.println();
        System.out.print("(iv)Members on the Left Hand Side : ");
        if(Column!=0){
        for(int i=Column-1;i>=0;i--)
        {
            System.out.print(m[Row][i]);
            if(i!=0)
            System.out.print(",");
        }
    }else {System.out.print("NO");}


        System.out.println();
        System.out.println("End of program.");
        input.close();
    }
    else{
    System.out.println("End of program.");
    }
}
}