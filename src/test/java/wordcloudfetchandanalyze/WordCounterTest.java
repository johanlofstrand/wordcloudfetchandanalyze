package wordcloudfetchandanalyze;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordCounterTest {

	WordCounter wordCounter;
	@Before
	public void init() throws Exception {
		wordCounter = new WordCounter();
	}

	@After
	public void destroy() throws Exception {
	}

	@Test
	public void testWeCanCountWords() {
		//GIVEN
		//a list of words (johan, bil, johan, hund, hus, johan, hund). 
		List<String> words = new ArrayList<String>();
		words.add("johan");
		words.add("bil");
		words.add("johan");
		words.add("hund");
		words.add("hus");
		words.add("johan");
		words.add("hund");
		//WHEN 
		//counting the word in the list
		Map<String,Integer> actualMap = wordCounter.countWordsInList(words);
		//THEN
		//we like to get a hashmap with 4 entries, one entry for each word in list 
		Map<String, Integer> expectedMap = new HashMap<String, Integer>();
		expectedMap.put("johan",4);
		expectedMap.put("bil",1);
		expectedMap.put("hund",2);
		expectedMap.put("hus",1);
		assertEquals(expectedMap.size(),actualMap.size());
	}
	
	
}
