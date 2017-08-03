package practice;

public class StringCompressionFinal {
	
	StringBuilder compress(String str) {
		int count = 1;
		int len = str.length();
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i = 0; i < len - 1; i++) {
			if(str.charAt(i) == str.charAt(i + 1))
				count= count + 1;
			else 
			{
				sb.append(count);
				count  = 1;
				sb.append(str.charAt(i + 1));
			}
		}
		sb.append(count);
	return sb;
	}
	
	public static void main(String[] args) {
		StringCompressionFinal obj = new StringCompressionFinal();
		StringBuilder sbr = obj.compress("aaaahhsdasssee");
		System.out.println(sbr);
	}

}
