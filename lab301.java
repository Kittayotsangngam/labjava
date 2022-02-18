public class lab301 {
    public static void main(String[] args) {
        int count =1,line=1,value =2;
        while(count<=100){
            if(Primenumber(value)==1&&PalalinDrome(value)==1)
            {
                if(line%10!=0)
                {
                    System.out.printf("%d ",value);
                }else if(line%10==0)
                {
                    System.out.printf("%d\n",value);
                }
                ++count;
                ++line;
            }
            ++value;
        }

    }
    public static int Primenumber(int number) {
        for(int i=2;i<number;i++)
        {
            if(number%i==0)
            {
                return 0;
            }
        }
        return 1;
    }    
    public static int PalalinDrome(int number)
    {
        if(number<10)
        return 1;
        int Result =0,q,Reminder;

        q=number;

        while(q!=0)
        {
            Reminder = q%10;
            Result = Result*10 +Reminder;
            q=q/10;
        }
        if(Result == number)
            return 1;
        else
            return 0;

    }
}
