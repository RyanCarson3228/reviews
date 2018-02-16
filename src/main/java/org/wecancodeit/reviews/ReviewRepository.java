package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	// make map
	Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		Review tales = new Review(123, "Tales of Berseria", "Tales URL", "JRPG", "Content", "2/16/2018", "Synopsis");
		Review tyranny = new Review(456, "Tyranny", "Tyranny URL", "RPG", "Content2", "2/16/2018", "Synopsis2");
		Review pillars = new Review(789, "Pillars of Eternity", "Pillars URL", "RPG", "Content3", "2/16/2018",
				"Synopsis3");

		populateReviewsMap(tales, tyranny, pillars);
	}

	// constructor for testing
	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	// to easily add more reviews
	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

	// to pull up a single review
	public Review findReview(long id) {
		return reviews.get(id);
	}

	// to pull up all courses
	public Collection<Review> allReviews() {
		return reviews.values();
	}
}
