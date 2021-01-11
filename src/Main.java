import Abstract.Driver;
import Abstract.Person;
import Classes.*;
import Enums.*;
import Enums.Character;

import java.util.ArrayList;

public class Main
{
    public static void main(String args[]) {

        Garage g = new Garage();
        g.setName("Гараж");
        Car c = new Car();
        c.setName("Машина");
        c.getName();
        Baby b = new Baby("Малышки");
        Drivers ds = new Drivers("Шофёры");
        ds.setCharacter(Character.COMPANIONABLY);
        DriverPerson dp = new DriverPerson("Бублик");
        Mechanics mp = new Mechanics("Винтик и Шпунтик");


        Baby kisonka = new Baby("Кисонька")
        {

        };

        Baby lastochka = new Baby("Ласточка")
        {

        };






        b.onArrive(g);
        b.see(dp);
        dp.onArrive(c);
        dp.setState(State.ANGRY);
        dp.getState();
        dp.step(Direction.ASIDE);
        mp.startFixing(c);

        int count = (int) (Math.random() * 60);
        for (int i = 0; i < count; i++) {
            mp.checkFixingProgress(c);
            mp.fix(c);
        }
        mp.checkFixingProgress(c);
        if (c.getHp() < 100)
        {
            dp.see(mp);
            dp.help();

        }
        else
        {
            System.out.println(c.name + " починена");
            dp.seat(c);
            dp.drive(c);
            dp.stopDrive(c);
            dp.exit(c);


            System.exit(0);

        }
        System.out.println("Такой уж характер " + ds.getCharacter() + " у каждого шофёра");
        ds.onSeeRepairing();
        ds.pick();
        for(Fastener f: Fastener.values())
        ds.screwUp(f);
        ds.giveAdvices();




    }


}
