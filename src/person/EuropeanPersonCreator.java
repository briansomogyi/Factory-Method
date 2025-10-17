package person;

public class EuropeanPersonCreator extends PersonCreator {
    @Override
    public Person createPerson() {
        return new EuropeanPerson();
    }
}
