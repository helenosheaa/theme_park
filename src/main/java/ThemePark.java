import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(String name) {
        this.name = name;
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public ArrayList getAttractions(){
        return new ArrayList(attractions);
    }

    public ArrayList getStalls(){
        return new ArrayList(stalls);
    }

//    public ArrayList reviews(){
//        return new ArrayList(reviews);
//    }
}
