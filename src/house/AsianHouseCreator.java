package house;

// Concrete creator for Asian houses
public class AsianHouseCreator extends HouseCreator {
    @Override
    public House createHouse() {
        return new AsianHouse();
    }
}
