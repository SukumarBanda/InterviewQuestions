import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RevRecord {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("src//input.txt");
		String target = "/home/mallari/notes/output.txt";
		
		FileWriter fWriter = new FileWriter(target);
		Scanner scan = new Scanner(file);
		
		while(scan.hasNext()) {
			String str = scan.nextLine();
			String [] s = str.split("\\|");
			String rev = null;
			
			for (int i = s.length-1;i>0; i--) {
				rev = rev+ s[i];
			}
			fWriter.write(rev);
		}
		scan.close();
		fWriter.close();
	}
}
