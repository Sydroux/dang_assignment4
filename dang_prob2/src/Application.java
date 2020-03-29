
public class Application {

	public static void main(String[] args) {
		DuplicateCounter dupecount = new DuplicateCounter();
		dupecount.count("problem2.txt");
		dupecount.write("unique_word_counts.txt");
	}
}
