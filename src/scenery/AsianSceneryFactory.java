package scenery;

import house.AsianHouse;
import house.House;
import nature.AsianPlant;
import nature.Plant;
import person.AsianPerson;
import person.Person;

// Concrete factory for Asian scenery
public class AsianSceneryFactory implements SceneryFactory {
    @Override
    public Person createPerson() {
        return new AsianPerson();
    }

    @Override
    public Plant createPlant() {
        return new AsianPlant();
    }

    @Override
    public House createHouse() {
        return new AsianHouse();
    }
}
