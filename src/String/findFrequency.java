package String;

public class findFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java";
		boolean[] visited=new boolean[s.length()];
		System.out.println("Character frequency");
		for(int i=0;i<s.length();i++) {
			if(visited[i]==true) {
				continue;
			}
			int count=1;
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					visited[j]=true;
				}
			}
			System.out.println(s.charAt(i)+":"+count);
		}
	}

}
