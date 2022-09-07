package firsttc;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		int count =0;
		System.out.println("Input string is - "+ text);
		String[] textarr = text.split(" ");
		String output="";
		System.out.print("Output String is - ");
		for (int i=0; i<textarr.length;i++)
		{
			for (int j=i+1;j<=textarr.length-1;j++)
			{
						
			if (textarr[i].equals(textarr[j]))
			{
				count=count+1;
				textarr[j]="";	
				}
			
			}
			
			System.out.print(textarr[i]+" ");
		
			if (count>0)
			{
				output = output+ textarr[i]+" ";
								
			}
			
			
		}
		
			}
		
	
}
			
			
			
		

	
