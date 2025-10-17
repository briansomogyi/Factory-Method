package house;

// Concrete creator for African houses
public class AfricanHouseCreator extends HouseCreator {
    @Override
    public House createHouse() {
        return new AfricanHouse();
    }
}