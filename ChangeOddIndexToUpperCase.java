package firsttc;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] testarr = test.toCharArray();
				
		System.out.print("Changing the odd index to uppercase for the string '" + test + "' is  ");
		
		for (int i=0; i<testarr.length;i++)
		{
			if (i%2==0)
			{
			   System.out.print(test.charAt(i)); //printing the even index character as it is
			   			 
			}
			else
			{
				System.out.print(Character.toUpperCase(test.charAt(i))); //printing the odd index by converting into uppercase 
			}
		}
			
				
	}

}
