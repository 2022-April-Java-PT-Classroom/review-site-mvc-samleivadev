package org.wecancoeit.reviews;

public class Review {
    private Long id;
    private String product;
    private String image;
    private String review;

    public Review (Long id, String product, String image, String review) {
        this.id = id;
        this.product = product;
        this.image = image;
        this.review = review;
    }

    public Long getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public String getImage() {
        return image;
    }

    public String getReview() {
        return review;
    }
}
