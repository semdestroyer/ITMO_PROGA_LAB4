package Classes;

import Abstract.Driver;
import Abstract.Object;
import Abstract.Person;
import Enums.Direction;
import Enums.State;
import Enums.Status;
import Interfaces.ArrivingObject;
import Interfaces.Drive;

import java.awt.*;

public class DriverPerson extends Driver implements ArrivingObject, Drive
{
    public DriverPerson(String name) {
        super(name);
    }

    @Override
    public void onSeeRepairing() {

    }

    @Override
    public void getSeeRepairing() {

    }

    @Override
    public void setSeeRepairing() {
        System.out.println(getName() + " приехал");
    }

    //@Override
    //public void drive(Car c) {
      //  System.out.println(getName() + " подъехал");
    //}

    @Override
    public String getName() {
      //  System.out.println(name);
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void walk() {

    }

    @Override
    public void see(Person p) {
        System.out.println(name + " увидел " + p.name);
    }

    @Override
    public void stop() {

    }


    @Override
    public void setStatus(Status s) {

    }

    @Override
    public Status getStatus() {
        return status;
    }

    @Override
    public void setState(State s) {
        this.state = s;
    }

    @Override
    public State getState() {
        String out;
        switch (this.state)
        {
            case SAD: out = "взгрустнул"; break;
            case ANGRY: out = "рассердился"; break;
            case SCARE: out = "испугался"; break;
            case HAPPY: out = "обрадовался"; break;
            default: out = "рассердился"; break;

        }
        System.out.println(getName() + " " + out);
        return this.state;
    }

    public void step(Direction d)
    {
        String dir;
        switch (d)
        {
            case ASIDE: dir = "в сторону"; break;
            case INSIDE: dir = "во внутрь"; break;
            default: dir = "В сторону"; break;
        }

        System.out.println(getName() + " отошел " + dir);
    }
    public void help()
    {
        System.out.println(getName() + " принялся помогать");
    }
    @Override
    public void whenNear() {
        System.out.println("подъезжает");
    }

    @Override
    public void onArrive(Object o) {
        System.out.println("Подъехал к " + o.getName());
    }

    @Override
    public void drive(Car c) {
        System.out.println(getName() + " повел " + c.getName());
    }

    @Override
    public void stopDrive(Car c) {
        System.out.println(getName() + " остановил " + c.getName());
    }
    @Override
    public void exit(Car c) {
        System.out.println(getName() + " вышел из " + c.getName());
    }

    @Override
    public void seat(Car c) {
        System.out.println(getName() + " сел за " + c.getName());
    }
}
