import java.util.*;
import java.io.*;

public class DuplicateCounter {
	private Map<String, Integer> wordCounter = new HashMap<String, Integer>(); 
	private int count = 0;
	
	public void count(String dataFile) {
		try {
			Scanner file = new Scanner(new File(dataFile));
			while(file.hasNext()) {
				for(String word : file.next().split("\\s+")) {
					if(wordCounter.containsKey(word)) {
						count = wordCounter.get(word);
						wordCounter.put(word, count + 1);
					} else {
						wordCounter.put(word, 1);
					}
				}
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
	
	public void write(String outputFile) {
		try {
			FileWriter type = new FileWriter(outputFile);
			for(Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
				type.write(entry.getKey() + ": " + entry.getValue() + "\n");
			}
			type.close();
		} catch (IOException e) {
			System.out.println("Invalid file content.");
		}
	}
}
