
public class Practice3 {

	public static void main(String[] args) {
		int count = 0;
		int k = 1;
		
		for(int i=65;i<=90;i++) {
			char ch = (char)i;
			System.out.print(ch+"\t");
			count++;

			if(k%2==0) {
				i += 32;
			}
			}
			
			if(count%5==0) {
				System.out.println();
				k++;
			}
		}
	}


