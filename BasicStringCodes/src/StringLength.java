public class StringLength {
	
	public static void main(String args[]) {
		
		String s="Subodh";
		
		int length=0;
		
		for(char ch:s.toCharArray()) {
			length++;
		}
		System.out.println("The Length of String "+s+" is "+length);
	}
	
}
