import java.util.ArrayList;

public class ThemePark implements IReviewed {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviews;
    public int rating;

    public ThemePark(String name, int rating) {
        this.name = name;
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
        reviews = new ArrayList<>();
        this.rating = rating;
    }

    public int getRating() {
        return this.rating;
    }

    public String getName(){
        return this.name;
    }

    public ArrayList getAttractions(){
        return new ArrayList(attractions);
    }

    public ArrayList<IReviewed> getAllReviews() {
        return new ArrayList<>(reviews);
    }


}
