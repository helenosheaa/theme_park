public class Dodgems extends Attraction implements ISecurity {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedToVisit(Visitor visitor) {
        return visitor.getAge() <= 15;
    }
}

