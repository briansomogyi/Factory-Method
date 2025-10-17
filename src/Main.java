import person.Person;
import house.House;
import nature.Plant;
import scenery.AfricanSceneryFactory;
import scenery.AsianSceneryFactory;
import scenery.EuropeanSceneryFactory;
import scenery.SceneryFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Generating complete sceneries using Abstract Factory ---\n");

        // Create and display the European scenery
        System.out.println("--- European Scenery ---");
        SceneryFactory europeanFactory = new EuropeanSceneryFactory();
        createAndDisplayScenery(europeanFactory);

        // Create and display the Asian scenery
        System.out.println("\n--- Asian Scenery ---");
        SceneryFactory asianFactory = new AsianSceneryFactory();
        createAndDisplayScenery(asianFactory);

        // Create and display the African scenery
        System.out.println("\n--- African Scenery ---");
        SceneryFactory africanFactory = new AfricanSceneryFactory();
        createAndDisplayScenery(africanFactory);
    }

    /**
     * Uses a given factory to create a person, a plant, and a house,
     * and then displays their representations.
     * @param factory The scenery factory to use (e.g., European, Asian, African).
     */
    public static void createAndDisplayScenery(SceneryFactory factory) {
        // Use the factory to create a family of related objects
        Person person = factory.createPerson();
        Plant plant = factory.createPlant();
        House house = factory.createHouse();

        // Display the components of the scenery
        System.out.println(person.draw());
        System.out.println(plant.render());
        System.out.println(house.build());
    }
}

