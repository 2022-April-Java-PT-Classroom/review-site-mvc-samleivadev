package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {
    Map<Long, Review> reviewslist = new HashMap<>();

    public ReviewRepository(){
        Review realMadridFc = new Review(1L, "Real Madrid FC", "/images/realmadrid.png","5 stars");
        Review barcelonaFc = new Review(2L, "Barcelona FC", "/images/barcelona.png","4.9 stars");
        Review manchesterUnited = new Review(3L, "Manchester United", "/images/munited.png", "4.89 stars");
        Review juventus = new Review(4L, "Juventus", "/images/juventus.png","4.5 stars");
        Review chelsea = new Review(5L, "Chelsea FC", "/images/chelsea.png","4 stars");

        reviewslist.put(realMadridFc.getId(),realMadridFc);
        reviewslist.put(barcelonaFc.getId(),barcelonaFc);
        reviewslist.put(manchesterUnited.getId(),manchesterUnited);
        reviewslist.put(juventus.getId(), juventus);
        reviewslist.put(chelsea.getId(),chelsea);

    }

    public ReviewRepository(Review... reviewToAdd) {
        for (Review review : reviewToAdd) {
            reviewslist.put(review.getId(), review);
        }

    }

    public Review findOne(long id) {
        return reviewslist.get(id);
    }

    public Collection<Review> findAll() {
        return reviewslist.values();
    }

}


