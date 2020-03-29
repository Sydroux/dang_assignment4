import java.util.*;
import java.io.*;

public class DuplicateRemover {
	private Set<String> uniqueWords = new HashSet<String>();
	
	public void remove(String dataFile) {
		try {
			Scanner file = new Scanner(new File(dataFile));
			while(file.hasNext()) {
				uniqueWords.add(file.next().trim());
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
	
	public void write(String outputFile) {
		try {
			FileWriter type = new FileWriter(outputFile);
			Iterator<String> it = uniqueWords.iterator();
			while(it.hasNext()) {
				type.write(it.next() + " ");
			}
			type.close();
		} catch (IOException e) {
			System.out.println("Invalid file content.");
		}
	}	
}
