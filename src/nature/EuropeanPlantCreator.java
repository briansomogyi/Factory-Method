package nature;

public class EuropeanPlantCreator extends PlantCreator {
    @Override
    public Plant createPlant() {
        return new EuropeanPlant();
    }
}
