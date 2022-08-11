package daily.codingExercise;

public class SquareRoot {

	public static void main(String[] args) {
		int num=169;
		int sqrt=0;
		for (int i=1;i<num;i++) {
			int temp = i*i;
			if (temp>num) {
			 sqrt=i-1;
				break;
			}
			
		}
System.out.println("The squareroot of " + num + " is " + sqrt);
	}

}
