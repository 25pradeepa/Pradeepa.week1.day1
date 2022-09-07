package firsttc;

public class ReverseEvenWords 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String test = "I am a software tester";
		System.out.println("Input string is - " + test);
		String[] testarr = test.split(" ");
		
		System.out.print("Output string after reverse even words is - ");
		for (int i=0; i<test.split(" ").length;i++)
		{
			
			if (i%2==0)
			{
			   System.out.print(testarr[i]); 
			   System.out.print(" ");
			   			 
			}
			else
			{
				
				char[] chararr = testarr[i].toCharArray();
				
				for (int j=chararr.length-1;j>=0;j--)
				{
				System.out.print(chararr[j]); 
				}
				System.out.print(" ");
	        }
	    }

   }
}
