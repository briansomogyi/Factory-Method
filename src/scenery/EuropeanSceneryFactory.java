package scenery;

import house.EuropeanHouse;
import house.House;
import nature.EuropeanPlant;
import nature.Plant;
import person.EuropeanPerson;
import person.Person;

// Concrete factory for European scenery
public class EuropeanSceneryFactory implements SceneryFactory {
    @Override
    public Person createPerson() {
        return new EuropeanPerson();
    }

    @Override
    public Plant createPlant() {
        return new EuropeanPlant();
    }

    @Override
    public House createHouse() {
        return new EuropeanHouse();
    }
}
