package class1.ex;

public class MoviewReviewMain1 {
    public static void main(String[] args) {
//simple example
        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "Life is an infinite loop";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "AboutTime";
        aboutTime.review = "Life Film ever!";

        System.out.println("영화 제목 : " + inception.title + "영화 리뷰: "+inception.review);
        System.out.println("영화 제목 : " + aboutTime.title + "영화 리뷰: "+aboutTime.review);




    }
}
