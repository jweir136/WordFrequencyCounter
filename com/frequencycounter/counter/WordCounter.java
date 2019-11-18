package com.frequencycounter.counter;

import java.io.*;
import java.util.*;

public class WordCounter {
	private Map<String, Integer> wordsFrequency;

	public WordCounter() {
		this.wordsFrequency = new TreeMap<String, Integer>();
	}

	public String countWords(List<String> words) {
		for (String word : words) {
			if (!this.wordsFrequency.containsKey(word))
				this.wordsFrequency.put(word, 1);
			else
				this.wordsFrequency.put(word, this.wordsFrequency.get(word) + 1);
		}

		return this.wordsFrequency.toString();
	}
}