package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {
    Map<Long, Review> reviewslist = new HashMap<>();

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


