package firsttc;



public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="madam";
String rev="";
char[] charstr=str.toCharArray();
for (int i=str.length()-1;i>=0;i--)
{
	
	rev= rev+Character.toString(charstr[i]);
			
}

if (str.equals(rev))
{
	System.out.println("Given sring "+ str + "  is a Palindrome");
}
else
{
	System.out.println("Given sring "+ str + "  is not a Palindrome");
}


	
}
	}


