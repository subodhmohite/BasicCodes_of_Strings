
public class Palindrome {
	
	public static void main(String args[]) {
		
		String str="subodh";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)){
			System.out.println("The String is Palindrome");
		}
		else {
			System.out.println("The String is not palindrome");
		}
	}

}
