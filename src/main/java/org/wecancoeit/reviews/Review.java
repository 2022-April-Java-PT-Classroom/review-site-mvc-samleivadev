package org.wecancoeit.reviews;

public class Review {
    private Long id;
    private String team;
    private String image;
    private String review;
    private String description;
    private String country;
    private String imgTeam;
    private String coach;


    public Review (Long id, String team, String image, String review, String description, String country, String imgTeam, String coach) {
        this.id = id;
        this.team = team;
        this.image = image;
        this.review = review;
        this.description=description;
        this.country=country;
        this.imgTeam=imgTeam;
        this.coach=coach;
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

    public String getDescription() {
        return description;
    }

    public String getCountry() {
        return country;
    }

    public String getImgTeam() {
        return imgTeam;
    }

    public String getCoach() {
        return coach;
    }
}
