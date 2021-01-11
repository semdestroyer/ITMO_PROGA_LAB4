package Abstract;

import Enums.State;
import Enums.Status;

public abstract class Person
{
    public String name;
    public Status status;
    public State state;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getName();
    public abstract void setName(String name);
    public abstract void walk();
    public abstract void see(Person p);
    public abstract void stop();
    public abstract void setStatus(Status s);
    public abstract Status getStatus();
    public abstract void setState(State s);
    public abstract State getState();


}
