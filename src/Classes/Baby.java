package Classes;

import Abstract.Object;
import Abstract.Person;
import Enums.State;
import Enums.Status;
import Interfaces.ArrivingObject;

public class Baby extends Person implements ArrivingObject
{


    public Baby(String name) {
        super(name);
    }

    @Override
    public String getName()
    {
     //   System.out.println(name);
       return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void walk()
    {
       System.out.println(name + " подошли");
    }

    @Override
    public void see(Person p)
    {
       System.out.println(name + " увидели " + p.name);
    }

    @Override
    public void stop() {
       System.out.println(name + " остановились");
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

    }

    @Override
    public State getState() {
        return null;
    }


    public void someAction() {

    }

    @Override
    public void whenNear() {

    }


    @Override
    public void onArrive(Object o) {
        System.out.println(getName() + " подошли к " + o.getName());
    }
}

