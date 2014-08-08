package wordcloudfetchandanalyze;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

	/*
	 * Counts occurences of eash word in the given list of strings and returns a Map with entries of "word with count" 
	 * @param List with String
	 * @return Map with a key value as the word and a value as the count for that word
	 */
	public Map<String, Integer> countWordsInList(List<String> words) {
		//Loop over the words and put them in a HashMap with the word as a key and and int to represent the 
		//Occurrence count of that word
		Map<String, Integer> wordsWithOccurenceCountMap = new HashMap<String, Integer>();
		for (String word : words) {
			if (wordsWithOccurenceCountMap.containsKey(word)) {
				Integer wordCount = wordsWithOccurenceCountMap.get(word);
				wordsWithOccurenceCountMap.put(word, wordCount.intValue()+1); //will update the word-entry with incremented word count.
			}
			else {
				wordsWithOccurenceCountMap.put(word, new Integer(1));
			}
		}
		return wordsWithOccurenceCountMap;
	}	
	
}
