public class TobaccoStall extends Stall implements ISecurity{

    public TobaccoStall(String name, String ownerName, String parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedToVisit(Visitor visitor) {
        return visitor.getAge() >= 18;
    }

}


