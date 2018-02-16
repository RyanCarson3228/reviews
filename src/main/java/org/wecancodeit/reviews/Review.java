package org.wecancodeit.reviews;

public class Review {

	private Long id;
	private String title;
	private String url;
	private String category;
	private String content;
	private String date;
	private String synopsis;

	// Constructor
	public Review(Long id, String title, String url, String category, String content, String date, String synopsis) {
		this.id = id;
		this.title = title;
		this.url = url;
		this.category = category;
		this.content = content;
		this.date = date;
		this.synopsis = synopsis;
	}

	// Accessors
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

	public String getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	public String getDate() {
		return date;
	}

	public String getSynopsis() {
		return synopsis;
	}

}
