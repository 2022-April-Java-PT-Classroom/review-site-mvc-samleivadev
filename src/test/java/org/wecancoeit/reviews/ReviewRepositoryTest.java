package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReviewRepositoryTest {
    private ReviewRepository underTest;
    private Review reviewOne = new Review (1L, "Product1", "Review Image","ReviewDescription");
    private Review reviewTwo = new Review (2L, "Product2", "Review Image","ReviewDescription");

    @Test
    public void shouldFindOneReview(){

        ReviewRepository underTest = new ReviewRepository (reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals (reviewOne, foundReview);



    }
}
