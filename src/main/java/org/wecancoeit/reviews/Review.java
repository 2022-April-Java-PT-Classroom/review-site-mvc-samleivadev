package org.wecancoeit.reviews;

public class Review {
    private Long id;
    private String team;
    private String image;
    private String review;

    public Review (Long id, String team, String image, String review) {
        this.id = id;
        this.team = team;
        this.image = image;
        this.review = review;
    }

    public Long getId() {
        return id;
    }

    public String getTeam() {
        return team;
    }

    public String getImage() {
        return image;
    }

    public String getReview() {
        return review;
    }
}
