package house;

// Concrete creator for European houses
public class EuropeanHouseCreator extends HouseCreator {
    @Override
    public House createHouse() {
        return new EuropeanHouse();
    }
}
