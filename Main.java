import java.io.*;
import java.util.*;
import com.frequencycounter.fileutils.*;
import com.frequencycounter.counter.*;

public class Main {
	public static void main(String[] args) throws Exception {
		FileOpener reader = new FileOpener("test.txt");
		WordCounter counter = new WordCounter();
		List<String> allWords = reader.getContents();
		String frequencies = counter.countWords(allWords);

		System.out.println(frequencies);
	}
}