import house.House;
import nature.Plant;
import person.AfricanPersonCreator;
import person.AsianPersonCreator;
import person.EuropeanPersonCreator;
import nature.AfricanPlantCreator;
import nature.AsianPlantCreator;
import nature.EuropeanPlantCreator;
import person.Person;
import scenery.AfricanSceneryFactory;
import scenery.AsianSceneryFactory;
import scenery.EuropeanSceneryFactory;
import scenery.SceneryFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("--- Generating individual components (Your original code) ---");

        // Using the original Character creators
        System.out.println("\n--- People ---");
        person.EuropeanPersonCreator europeanCharacterFactory = new person.EuropeanPersonCreator();
        System.out.println(europeanCharacterFactory.createPerson().draw());

        person.AfricanPersonCreator africanCharacterFactory = new person.AfricanPersonCreator();
        System.out.println(africanCharacterFactory.createPerson().draw());

        person.AsianPersonCreator asianCharacterFactory = new person.AsianPersonCreator();
        System.out.println(asianCharacterFactory.createPerson().draw());


        // Using the original Plant creators
        System.out.println("\n--- Plants ---");
        nature.EuropeanPlantCreator europeanPlantFactory = new nature.EuropeanPlantCreator();
        System.out.println(europeanPlantFactory.createPlant().render());

        nature.AfricanPlantCreator africanPlantFactory = new nature.AfricanPlantCreator();
        System.out.println(africanPlantFactory.createPlant().render());

        nature.AsianPlantCreator asianPlantFactory = new nature.AsianPlantCreator();
        System.out.println(asianPlantFactory.createPlant().render());


        // Using the new House creators
        System.out.println("\n--- Houses ---");
        house.EuropeanHouseCreator europeanHouseCreator = new house.EuropeanHouseCreator();
        System.out.println(europeanHouseCreator.createHouse().build());

        house.AsianHouseCreator asianHouseCreator = new house.AsianHouseCreator();
        System.out.println(asianHouseCreator.createHouse().build());

        house.AfricanHouseCreator africanHouseCreator = new house.AfricanHouseCreator();
        System.out.println(africanHouseCreator.createHouse().build());


        System.out.println("\n\n--- Generating scenery using Abstract Factory ---");

        // Create a European scenery
        System.out.println("\n--- European Scenery ---");
        createAndRenderScenery(new EuropeanSceneryFactory());

        // Create an Asian scenery
        System.out.println("\n--- Asian Scenery ---");
        createAndRenderScenery(new AsianSceneryFactory());

        // Create an African scenery
        System.out.println("\n--- African Scenery ---");
        createAndRenderScenery(new AfricanSceneryFactory());
    }

    public static void createAndRenderScenery(SceneryFactory factory) {
        Person person = factory.createPerson();
        Plant plant = factory.createPlant();
        House house = factory.createHouse();

        System.out.println("Rendering a complete scenery:");
        person.draw();
        plant.render();
        house.build();
    }
}