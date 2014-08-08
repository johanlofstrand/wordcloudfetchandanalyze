package wordcloudfetchandanalyze;
import java.util.Iterator;
import java.util.TreeSet;

public class WordCount implements Comparable<WordCount> {
		
		private String word;
		private Integer count;
		
		public WordCount(String word, Integer count) {
			this.word = word;
			this.count = count;
		}
		
		public String getWord() {
			return this.word;
		}
		public Integer getCount() {
			return this.count;
		}
	
		@Override
		public int compareTo(WordCount wc) {
			return this.getCount() - wc.getCount();
		}
		public String toString() {
			return this.word + "::" + this.count;
		}

 }