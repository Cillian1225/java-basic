package class1.ex;

public class MoviewReviewMain2 {
    public static void main(String[] args) {
//simple example

        MovieReview[] reviews = new  MovieReview[2];
        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "Life is an infinite loop";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "AboutTime";
        aboutTime.review = "Life Film ever!";
        reviews[1] = aboutTime;

        for (MovieReview review : reviews) {
            System.out.println("영화 제목 : " + review.title + " 영화 리뷰: "+review.review);
        }





    }
}
