import java.util.Scanner;
import java.util.Arrays;
public class lab302 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
        String list1Input = input.nextLine();
        System.out.print("Enter list2: ");
        String list2Input = input.nextLine();
        String list1[] = list1Input.split(" ");
        String list2[] = list2Input.split(" ");
        int numList1[] = new int[list1.length];
        int numList2[] = new int[list2.length];
        for(int i = 0;i<list1.length;i++){
            numList1[i] = Integer.parseInt(list1[i]);
        }
        for(int i = 0;i<list2.length;i++){
            numList2[i] = Integer.parseInt(list2[i]);
        }
        int[] result = merge(numList1,numList2);

        Arrays.sort(result);

        System.out.println("The merged list is" + Arrays.toString(result));

        input.close();
        
    }
    public static int[] merge(int[] list1,int[] list2)
     
    {
        int[] list3 = new int[list1.length+list2.length];

        System.arraycopy(list1, 0, list3, 0,list1.length);
        System.arraycopy(list2, 0, list3, list1.length,list2.length);

        return list3;
    }
}
