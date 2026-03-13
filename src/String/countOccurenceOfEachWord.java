package String;

public class countOccurenceOfEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is a popular lan and  java is a dynamic Lan";
		String[] splitStr=s.toLowerCase().split(" ");
		System.out.println("Words Occurence");
		for(int i=0;i<splitStr.length;i++) {
			if(splitStr[i].equals("")) 
				continue;
				int count =1;
				for(int j=i+1;j<splitStr.length;j++) {
					if(splitStr[i].equals(splitStr[j])) {
						count++;
						splitStr[j]="";
					}
				}
			System.out.println(splitStr[i]+" : "+count);
		}
	}

}
