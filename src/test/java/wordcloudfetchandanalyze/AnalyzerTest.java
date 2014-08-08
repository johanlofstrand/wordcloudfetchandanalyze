package wordcloudfetchandanalyze;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class AnalyzerTest {

	@Test
	public void test() {
		Analyzer analyzer = new Analyzer();
		//GIVEN
		Tweet tweet = new Tweet();
		tweet.setText("En populär öl är Boston summer ale, men en annan bra öl är Oppgigårds pale ale");
		//WHEN
		Map<String, Integer> map = analyzer.getWordCounts(tweet);
		//THEN
	    for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.printf("Key : %s and Value: %s %n", entry.getKey(),
                                                           entry.getValue());
        }
		assertEquals(12,map.size());
	}

}
