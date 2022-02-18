import java.util.Scanner; 
public class lab204{
public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of lines: ");
    int line=in.nextInt();
    System.out.println("");
    if(line>0&&line<=15){
    for (int i=1; i<=line; i++){
      if(line>=10){
        if(i!=10)
        {
          System.out.print(" ");
        }
      }
      if(line>=11){
        if(i!=11)
        {
          System.out.print("  ");
        }
      }
      if(line>=12){
        if(i!=12)
        {
          System.out.print("   ");
        }
      }
      if(line>=13){
        if(i!=13)
        {
          System.out.print("    ");
        }
      }
      if(line>=14){
        if(i!=14)
        {
          System.out.print("     ");
        }
      }
      if(line>=15){
        if(i!=15)
        {
          System.out.print("      ");
        }
    }
      for (int j=1; j<=(line-i)*2; j++){
      System.out.print(" ");
      }
    for (int k=i; k>=1; k--){
      System.out.print(" "+k);          
    }                                        
    for (int l=2; l<=i; l++){
      System.out.print(" "+l);    
    }                           
    System.out.println();
    } 
  }
    in.close();                                            
}
}