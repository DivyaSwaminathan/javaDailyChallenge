package daily.codingExercise;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str="  Make hay while      the Sun Shines      ";
		String strArr[]=str.split(" ");
		String string = strArr[(strArr.length)-1];
		System.out.println("The last word in the given string is : " + string);
		System.out.println("The size of the string is : " + string.length());

	}

}
