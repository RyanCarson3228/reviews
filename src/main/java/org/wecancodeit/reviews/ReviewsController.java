package org.wecancodeit.reviews;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewsController {
	
	@Resource
	ReviewRepository reviewRepo;
	
	@RequestMapping(value = "/reviews")
	public String getAllReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.allReviews());
		return "reviews";
	}

	@RequestMapping("/review")
	public String getReview(@RequestParam Long id, Model model) {
		model.addAttribute("review", reviewRepo.findReview(id));
		return "review";
		
	}
	
}
