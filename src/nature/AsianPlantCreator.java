package nature;

public class AsianPlantCreator extends PlantCreator {
    @Override
    public Plant createPlant() {
        return new AsianPlant();
    }
}
