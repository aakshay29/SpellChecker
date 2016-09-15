import java.io.FileNotFoundException;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> misspelled = new ArrayList<String>();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String input = sc1.nextLine();
		String delim = " ";
		String[] parts = input.split(delim);	
		
		SpellCheck sc = new SpellCheck();
		for(int i = 0; i < parts.length ; i++){
			try {
				boolean checker = sc.Checkker(parts[i].toString());
				if(checker == false){
					System.out.println(parts[i] + " is not a word. Please reenter.");
					misspelled.add(parts[i]);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	
		sc1.close();
		System.out.println("\nList of misspelled words: " + misspelled);
	}
}
