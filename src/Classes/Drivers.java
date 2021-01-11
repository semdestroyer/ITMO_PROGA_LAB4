package Classes;

import Abstract.Driver;
import Abstract.Person;
import Enums.Character;
import Enums.Fastener;
import Enums.State;
import Enums.Status;

import java.lang.invoke.SwitchPoint;

public class Drivers extends Driver
{
    public Character ch;
    public Drivers(String name) {
        super(name);
    }

    @Override
    public void onSeeRepairing() {
        System.out.println("Если " + this.name + " увидят, что кто-нибудь починяет машину, он обязательно подойдет и тоже");
    }

    @Override
    public void getSeeRepairing() {

    }

    @Override
    public void setSeeRepairing() {

    }



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
        System.out.println(this.name +" подойдет");
    }

    @Override
    public void see(Person p) {

    }

    @Override
    public void stop() {

    }


    @Override
    public void setStatus(Status s) {
        s = status;
    }
    @Override
    public Status getStatus()
    {
        return status;
    }


    @Override
    public void setState(State s) {

    }

    @Override
    public State getState() {
        return state;
    }

    public void setCharacter(Character ch) {
        this.ch = ch;
    }

    public String getCharacter() {
        String cho;
        switch (this.ch)
        {
            case FRIENDLY: cho = "дружелюбный";break;
            case COMPANIONABLY: cho = "компанейский";break;
            case CHEERFUL: cho = "веселый";break;
            case TENSE: cho = "напряженный";break;
            default: cho = "компанейский";break;
        }

        return cho;
    }
    public void giveAdvices(){System.out.println("начнет давать давать советы");}
    public void screwUp(Fastener f){
        String fast;
        switch (f)
        {
            case NUT:fast = "гайку";break;
            case BOLT:fast = "болт";break;
            case SCREW:fast = "винтик";break;
            default:fast = "гайку";break;

        }

        System.out.println("начнет подвинчивать " + fast);
    }
    public void pick(){System.out.println("начнет ковырять");}
}
