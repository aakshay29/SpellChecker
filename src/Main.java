import java.io.FileNotFoundException;
//import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//HashMap hm = new HashMap();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String input = sc1.nextLine();
		String delim = " ";
		String[] parts = input.split(delim);	
		
		SpellCheck sc = new SpellCheck();
		for(int i = 0; i < parts.length ; i++){
			try {
				boolean checker = sc.Checkker(parts[i].toString());
				if(checker == false)
					System.out.println(parts[i] + " is not a word. Please reenter.");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	
		sc1.close();
	}
}
