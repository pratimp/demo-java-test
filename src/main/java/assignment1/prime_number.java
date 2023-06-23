package assignment1;

public class prime_number
{
    public static void main(String[] args)
    {
        int ct=0,n=0,i=1,j=1;
        System.out.printf(" prime numbers of 2 to 100\n ");
        while(n<25)
        {
            j=1;
            ct=0;
            while(j<=i)
            {
                if(i%j==0)
                    ct++;
                j++;
            }
            if(ct==2)
            {
                System.out.printf(" %d ",i);
                n++;
            }
            i++;
        }
    }
}