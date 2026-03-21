package ControlStatement;

public class printNoDivisibleBy3And5UpTo100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		System.out.println("Num divisible by both 3 and 5 up to 100: ");
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}

}
