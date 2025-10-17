package scenery;

import person.Person;
import house.House;
import nature.Plant;

// Abstract factory for creating scenery elements
public interface SceneryFactory {
    Person createPerson();
    Plant createPlant();
    House createHouse();
}
