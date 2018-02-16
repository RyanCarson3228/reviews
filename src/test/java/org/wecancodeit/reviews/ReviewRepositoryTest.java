package org.wecancodeit.reviews;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long reviewOneId = 123;

	@Mock
	private Review reviewOne;

	private long reviewTwoId = 456L;

	@Mock
	private Review reviewTwo;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

		when(reviewOne.getId()).thenReturn(reviewOneId);
		when(reviewTwo.getId()).thenReturn(reviewTwoId);
	}

	@Test
	public void shouldFindFirstReview() {
		underTest = new ReviewRepository(reviewOne);

		Review result = underTest.findReview(reviewOneId);

		assertThat(result, is(reviewOne));
	}

	@Test
	public void shouldFindSecondReview() {
		underTest = new ReviewRepository(reviewOne, reviewTwo);

		Review result = underTest.findReview(reviewTwoId);

		assertThat(result, is(reviewTwo));
	}

	@Test
	public void shouldPullUpAllReviews() {
		underTest = new ReviewRepository(reviewOne, reviewTwo);

		Collection<Review> result = underTest.allReviews();

		assertThat(result, containsInAnyOrder(reviewOne, reviewTwo));

	}

}
