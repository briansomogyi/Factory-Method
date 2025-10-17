package person;

public class AfricanPersonCreator extends PersonCreator {
    @Override
    public Person createPerson() {
        return new AfricanPerson();
    }
}
