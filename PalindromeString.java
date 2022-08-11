package daily.codingExercise;

public class PalindromeString {

	public static void main(String[] args) {
		String str= "A man, a plan, a canal: Panama";
		boolean flag;
		str=str.replaceAll("[^a-zA-Z]", "");
		//System.out.println(str);
		StringBuilder strRev=new StringBuilder(str);
		strRev=strRev.reverse();
		//System.out.println(strRev);
		if (str.equalsIgnoreCase(strRev.toString())) {
			//System.out.println("The given string is palindrome");
			flag=true;
		}
		else {
			//System.out.println("the given string is not a palindrome");
			flag=false;
		}
		System.out.println(flag);
	}

}
