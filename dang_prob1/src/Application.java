public class Application {

	public static void main(String[] args) {
		DuplicateRemover duperemover = new DuplicateRemover();
		duperemover.remove("problem1.txt");
		duperemover.write("unique_words.txt");
	} 
}
