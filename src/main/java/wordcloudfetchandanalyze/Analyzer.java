package wordcloudfetchandanalyze;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Analyzer {
	
	public Map<String,Integer> getWordCounts (Tweet tweet) {
		WordCounter wordCounter = new WordCounter();
		String[] wordsInTweet = tweet.getText().replaceAll("[^\\p{L} ]", "").toLowerCase().split("\\s+");
		List<String> listOfWords = Arrays.asList(wordsInTweet);
		Map<String,Integer> mapOfWordCounts = wordCounter.countWordsInList(listOfWords);
		return mapOfWordCounts;		
	}
}
	