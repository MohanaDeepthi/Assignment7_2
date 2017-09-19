import java.util.Arrays;



public class Assignment7_2 {
	public static void main(String args[]){
		String exmpl=new String("My name is XYZ");
		String[] parts = exmpl.split("\\s+");   
		Arrays.sort(parts);  
		StringBuilder sb = new StringBuilder();  
		for(String s:parts){  
		   sb.append(s);  
		   sb.append(" ");  
		}  

		String sorted = sb.toString().trim(); 
		System.out.println(""+sorted);
		String reversed =reverseString(sorted);
		System.out.println("Reversed "+reversed);
			
			
		}
		
		
	
	
	public static String reverseString(String inpString){
		//StringBuilder sb = new StringBuilder(word.length() + 1);
		String[] words=inpString.split(" ");
		String reverseString="";
		for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
		return reverseString;
		
		
		
	}
}
