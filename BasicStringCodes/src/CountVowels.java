
public class CountVowels {
	public static void main(String args[]) {
		
		String str="Subodh";
		int count=0;
		char c[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'
					||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='O'
					||str.charAt(i)=='I' ||str.charAt(i)=='U') {
				count++;
			}
			else {
				
			}
			
		}
		System.out.println("Vowels in "+str+ " are "+count);
	}

}
