
public class Practice3 {

	public static void main(String[] args) {
		int count = 0;
		int line = 1;
		
		for(int i=65;i<=90;i++) {

			if(line%2==0) {
				i += 32;
				char ch2 = (char)i;
				System.out.print(ch2+"\t");
				i -= 32;
				count++;
			}else {
				char ch = (char)i;
				System.out.print(ch+"\t");
				count++;
			}
			
			if(count%5==0) {
				System.out.println();
				line++;
			}
		}
	}
}

