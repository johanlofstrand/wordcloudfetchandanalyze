package wordcloudfetchandanalyze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class WordController {
	
	private static final Logger logger = LoggerFactory.getLogger(WordController.class);
	
	@RequestMapping("/")
    String home() {
    	logger.info("Started WordController!");
    	
    	/*/
    	 * Part 1: Access the REST service for getting Tweets
    	 */
    	RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:5000";
		
		Tweet tweet = restTemplate.getForObject(url, Tweet.class);
    	
		/*
		 * Part 2: Do the analyze part, e.g. count the words in the tweet
		 */
		Analyzer analyzer = new Analyzer();
		Map<String,Integer> mapOfWordCounts = analyzer.getWordCounts(tweet);
		
		/*
		 * Part 3: Return the result as JSON  in the format of
		 * {
		 * 		'johan': 3,
		 *  	'öl': 4		
		 * }
		 */
		
		JSONObject wordcountjson = new JSONObject();
		wordcountjson.putAll(mapOfWordCounts);
		
		return wordcountjson.toJSONString();
    }

}

