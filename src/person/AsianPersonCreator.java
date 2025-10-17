package person;

public class AsianPersonCreator extends PersonCreator {
    @Override
    public Person createPerson() {
        return new AsianPerson();
    }
}
