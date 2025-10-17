package house;

// Abstract creator for houses
public abstract class HouseCreator {
    public abstract House createHouse();

    public String constructHouse() {
        House house = createHouse();
        return house.build();
    }
}
