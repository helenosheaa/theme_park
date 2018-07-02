public class Dodgems extends Attraction implements ISecurity {

    public Dodgems(String name) {
        super(name);
    }

    public boolean isAllowedToVisit(Visitor visitor) {
        return visitor.getAge() <= 14;
    }
}

