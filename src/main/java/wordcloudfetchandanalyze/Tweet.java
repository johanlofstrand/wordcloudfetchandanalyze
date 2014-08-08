package wordcloudfetchandanalyze;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tweet {
	
	private String text;
	private Date createdAt;
	private String fromUser;
	
	public String getFromUser() {
		return fromUser;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	
	
}
