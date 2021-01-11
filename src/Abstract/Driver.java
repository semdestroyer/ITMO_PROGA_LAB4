package Abstract;

import Abstract.Person;

public abstract class Driver extends Person
{
    public Driver(String name) {
        super(name);
    }

    public abstract void onSeeRepairing();
    public abstract void getSeeRepairing();
    public abstract void setSeeRepairing();

}
