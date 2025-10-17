package scenery;

import house.AfricanHouse;
import house.House;
import nature.AfricanPlant;
import nature.Plant;
import person.AfricanPerson;
import person.Person;

// Concrete factory for African scenery
public class AfricanSceneryFactory implements SceneryFactory {
    @Override
    public Person createPerson() {
        return new AfricanPerson();
    }

    @Override
    public Plant createPlant() {
        return new AfricanPlant();
    }

    @Override
    public House createHouse() {
        return new AfricanHouse();
    }
}
