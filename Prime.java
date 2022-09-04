package firsttc;


public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=11;
    boolean val = false;
   for(int i=0;i<=n-1;i++)
    {
      //any number is divisible by 1, any number is divisible by itself so skipped the check for #1 and the number itself.
	   if (n%(i+2)==0 & n!=(i+2))
    	{
    		val = true;
    		break;
    	}
    }
    	if (val != true)
    	{
    		System.out.println(n + "  is a prime number");
    	}
    	else
    	{
    		System.out.println(n + "  is not a prime number");	
    	}
    
	}

}
