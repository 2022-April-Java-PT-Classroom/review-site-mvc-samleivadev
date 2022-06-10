package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {
    Map<Long, Review> reviewslist = new HashMap<>();

    public ReviewRepository(){
        Review realMadridFc = new Review(1L, "Real Madrid FC", "/images/realmadrid.png","5 stars","The pride of Spain and a titan atop the list of all-time Champions League winners, Real Madrid is known for its dynamic goals and celebrity players.","Spain","/images/RMTeam.jpg","Carlo Ancelotti");
        Review barcelonaFc = new Review(2L, "Barcelona FC", "/images/barcelona.png","4.9 stars","The club has a long-standing rivalry with Real Madrid, and matches between the two teams are referred to as El Clásico.","Spain","/images/baceTeam.jpg","Xavi Hernández");
        Review manchesterUnited = new Review(3L, "Manchester United", "/images/munited.png", "4.89 stars","Manchester United is one of the most prestigious, respected and feared teams in world football. ","England","/images/manTeam.jpg","Erik ten Hag");
        Review juventus = new Review(4L, "Juventus", "/images/juventus.png","4.5 stars","Today, the bianconeri are the most successful club in Italian football with 35 Scudetti and are in position to win their eighth consecutive Serie A title.","Italy","/images/juveTeam.jpg","Joe Montemurro");
        Review chelsea = new Review(5L, "Chelsea FC", "/images/chelsea.png","4 stars","Chelsea F.C., also called the Blues, are one of the most successful football clubs in England. They were founded in 1905 and have played mostly in England's top Premier League. ","England","/images/chelTeam.jpg","Thomas Tuchel");

        reviewslist.put(realMadridFc.getId(),realMadridFc);
        reviewslist.put(barcelonaFc.getId(),barcelonaFc);
        reviewslist.put(manchesterUnited.getId(),manchesterUnited);
        reviewslist.put(juventus.getId(), juventus);
        reviewslist.put(chelsea.getId(),chelsea);
git
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


