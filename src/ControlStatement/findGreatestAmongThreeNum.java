package ControlStatement;

public class findGreatestAmongThreeNum{
	public static void main(String arg[]) {
		int a=22;
		int b=111;
		int c=89;
		
		if(a>b) { //outer if
				if(a>c) {   //inner if
				System.out.println(a+" is greater");
				}else {   //inner else
					System.out.println(c+" is greater");
				}
		}else {  //outer else 
				if(b>c) {  //inner if
					System.out.println(b+" is greater");
				}else {  //inner else
					System.out.println(b+" is greater");
				}
		}
	}
}