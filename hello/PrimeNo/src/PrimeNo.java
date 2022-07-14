public class PrimeNo
{
    public static void main(String [] args)
    {
        boolean Result = Prime(10);
        System.out.println(Result);

        int count=0;
        for(int i =10;i<50;i++)
        {
            if(Prime(i))
            {
                count++;
                System.out.println(i+" is a prime number");

                if(count>=10)
                {
                    System.out.println("Exiting Loop");
                    break;
                }
            }
        }

    }

    public static Boolean Prime(int n)
    {
        if( n==1 )
        {
            return false;
        }

        for(int i = 2 ; i<=n/2 ; i++)
        {
            if(n%2==0)
            {
                return false;
            }
        }
        return true;
    }
}
