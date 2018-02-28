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
		Review nier = new Review((long) 123, "Nier:Automata", "./images/nier.jpg", "JRPG",
				"They cheated me. They said this is a game. But this is an art.",
				"2/16/2018", "\"Nier: Automata[a] (stylized as NieR:Automata) is an action role-playing video game developed by PlatinumGames and published by Square Enix for PlayStation 4 and Microsoft Windows. The game was released in Japan in February 2017, and worldwide the following month. Nier:Automata is a sequel to the 2010 video game Nier, a spin-off of the Drakengard series. Set in the midst of a proxy war between machines created by otherworldly invaders and the remnants of humanity, the story follows the battles of a combat android, her companion, and a fugitive prototype. Gameplay combines role-playing elements with action-based combat and mixed genre gameplay similar to that of Nier.");

		Review tyranny = new Review((long) 456, "Tyranny", "./images/tyranny.jpg", "RPG",
				"Tyranny breaks the RPG trope of casting you as the plucky young hero, but explictly begins with you as the villian, part of a conquering empire imposing its will in the manner that gives the game its title; your decisions all live within that framework. Many role playing games attempt to offer a moral choice or claim that your decisions impact the world, but often those promises turn out to be disappointing, where dialog choices seem to be one of: \"I'm as pure as the driven snow\", \"I'm snarky and don't care about anything\", or \"I eat live kittens for breakfast muhahaha!\" .This game, in contrast, is one of the few I've played where your choices were not as clear cut, where decisions were rarely simple. Every decision will change how characters and factions view you, with your choices moving them towards loyalty or fear, favor or wrath. You are often forced to choose between the lesser of two unappealing options; there's no black and white in Tyranny, only various shades of grey. The dialog choices felt natural, with all choices being realistic options. And as in life, seemingly small things you do or say can have large impacts later on. Of course, the game still has a script, and your choices fit into Tyranny's narrative; you may be the protagonist in the story, but you are also a servent of Kyros, constantly subject to the will and manipulations of the Overlord. As a result, the structure is well justified in the narrative, and this may be the most clever part of the consistently good writing. The game has an excellent story to tell, and ultimately your decisions color a larger, well-constructed narrative that I found quite engaging. My desire to know more about the place and its people after I finished the game is a testement to the worldbuilding the developers accomplished. Combat was serviceable, but despite the wealth of stats, damage types, etc. it wasn't terribly challenging tactically. I did enjoy the spell creation system, and overall thought the mechanics of the game were well done. The art and music were both excellent throughout, each helping you get into the setting. I enjoyed my time as a Fatebinder, exploring the mysteries of the Tiers, learning its history and helping shape its future. I recommend Tyranny to anyone that enjoys story-heavy western RPGs, especially fans of the Baldur's Gate series or Planescape: Torment.",
				"2/16/2018",
				"Tyranny is a role-playing video game developed by Obsidian Entertainment and published by Paradox Interactive. The game was released for Microsoft Windows, OS X, and Linux on November 10, 2016.\r\n"
						+ "While not a sequel, Tyranny builds upon the gameplay and engine used in Obsidian's previous title Pillars of Eternity, allowing the developers to spend more time on crafting a game where player choices have a more meaningful effect on the game's story. The game starts after the evil overlord Kyros has already conquered the world, and where the player-character, a Fatebinder, is one of the higher-ranked members in Kyros' power structure. As a Fatebinder, the player must travel the world to help restore order after Kyros' victory, and make decisions on how to handle the various factions of survivors, which can affect what companions, spells, and abilities the player may select from.");

		Review pillars = new Review((long) 789, "Pillars of Eternity", "./images/pillars.jpg", "RPG",
				"This is one of my favorite games of all time. The story is amazing, the world is incredible, and by the end I was staying up late and waking up early just to find out what would happen next. The first act is a bit slow, and it can feel overwhelming to be dropped into a world without any background or lore, but it's fairly easy to pick up on. Besides the masterful writing and epic story, I love how your choices actually matter. It is possible to get out of many, many tense situations without fighting, just as it is possible to turn peaceful situations into bloodshed. Your choices matter, your reputation matters, and the relationships you build with your companions matter. 10/10",
				"2/16/2018",
				"Pillars of Eternity is a role-playing video game developed by Obsidian Entertainment and published by Paradox Interactive. It was released for Microsoft Windows, OS X, and Linux on March 26, 2015. The game is a spiritual successor to the Baldur's Gate and Icewind Dale series, along with Planescape: Torment. Obsidian started a crowdfunding campaign on Kickstarter for it in September 2012. The campaign raised over US$4 million, which was the highest funded video game at the time. The game uses the Unity engine.");

		populateReviewsMap(nier, tyranny, pillars);
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
