package Classes;

import Abstract.Object;
import Abstract.Person;
import Enums.State;
import Enums.Status;
import Interfaces.Repairs;

import java.util.Random;

public class Mechanics extends Person implements Repairs
{
    public Mechanics(String name) {
        super(name);
    }

    @Override
    public String getName() {
  //      System.out.println(name);
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk() {

    }

    @Override
    public void see(Person p) {

    }

    @Override
    public void stop() {

    }


    @Override
    public void setStatus(Status s)
    {
        this.status = s;
    }
    @Override
    public Status getStatus()
    {
        String out;
        switch (this.status)
        {
            case SEAT:out = "Сели";break;
            case WALK:break;
            case STOP:break;
            case DRIVE:break;
        }



        return status;
    }

    @Override
    public void setState(State s) {

    }

    @Override
    public State getState() {
        return state;
    }


    @Override
    public void fix(Car c) {
        System.out.println(getName() + " чинят");
        if(c.getHp() >= 100) {
            c.setHp(100);
        }
        else
        {
            c.setHp((int) (c.getHp() + Math.random() * 5));

        }
    }

    @Override
    public void checkFixingProgress(Car c) {
        System.out.println(getName() + " починили " + c.getName() + " на " + c.getHp() + "%");
    }

    @Override
    public void startFixing(Object o) {
        System.out.println(getName() + " начали чинить " + o.getName());
    }
}
