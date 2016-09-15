import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SpellCheck {

	public boolean Checkker(String word) throws FileNotFoundException {
		File file = new File("/usr/share/dict/words");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			String d = sc.nextLine();
			if (d.equalsIgnoreCase(word))
				return true;
		}
		sc.close();
		return false;
	}
}
