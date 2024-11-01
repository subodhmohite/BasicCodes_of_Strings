
public class RemoveVowels {
	
	public static void main(String args[]) {
		String str="Subodh";
		String str1="";
		
		str1=str.replaceAll("[aeiou]", "");
		System.out.println("The String without vowels is "+str1);
	}

}
