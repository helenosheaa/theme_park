public class Rollercoaster extends Attraction implements ISecurity{

    public Rollercoaster(String name) {
        super(name);
    }

    public boolean isAllowedToVisit(Visitor visitor) {
        return visitor.getHeight() >= 145 && visitor.getAge() >= 12;
    }
}
