package String;

public class comparePerformanceOf_String_StringBuilder_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Performance of String Time
		int iterations=100000;
		long startString=System.currentTimeMillis();
		String s="";
		for(int i=0;i<iterations;i++) {
			s=s+'a';
		}
		long endString = System.currentTimeMillis();
		long stringTime=endString-startString;
		System.out.println("Performance of String(Slowest): "+stringTime);
		
//		Performance of StringBuilder Time
		long startBuilder=System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<iterations;i++) {
			sb.append("a");
		}
		long endBuilder=System.currentTimeMillis();
		long builderTime=endBuilder-startBuilder;
		System.out.println("Performance of StringBuilder(Fastest): "+builderTime);
		
		
//		Performance of StringBuffer Time
		long startBuffer=System.currentTimeMillis();
		StringBuffer sbf=new StringBuffer();
		for(int i=0;i<iterations;i++) {
			sbf.append("a");
		}
		long endBuffer=System.currentTimeMillis();
		long bufferTime=endBuffer-startBuffer;
		System.out.println("Performance of StringBuffer(Slightly slower than StringBuilder): "+bufferTime);
		
	}

}
