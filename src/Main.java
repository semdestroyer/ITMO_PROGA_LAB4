import Abstract.Driver;
import Abstract.Person;
import Classes.*;
import Enums.*;
import Enums.Character;
import Exceptions.NonDriveException;
import Exceptions.NonRepairException;

import java.util.ArrayList;

public class Main
{
    static class talks {
         void on() {
            System.out.println("Разговоров о коварстве Винтика и Шпунтика хватило до самого вечера");
        }}


    public static void main(String args[]) throws NonDriveException {

        new talks().on();
        class hope {
            void on() {
                System.out.println(" Когда надежда на возвращение Винтика и Шпунтика совсем пропала, в конце улицы показалась машина.");
            }}
        hope h = new hope();
        h.on();

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
            @Override
            public void someAction() {
                System.out.println(getName() + " злорадно посмеявается");
            }
        };
        Baby lastochka = new Baby("Ласточка")
        {
            @Override
            public void someAction() {
                System.out.println(getName() + " исчезла");
            }
        };




        lastochka.someAction();
        kisonka.someAction();

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
        try {
            mp.checkFixingProgress(c);
            if (c.getHp() < 100) {
                dp.see(mp);
                dp.help();

            }
            else
            {
                throw new NonRepairException();
            }
        }
        catch (NonRepairException e)
            {
                System.out.println(e.toString());
                System.out.println(c.name + " починена");
                if(dp instanceof DriverPerson) {
                    dp.seat(c);
                    dp.drive(c);
                    dp.stopDrive(c);
                    dp.exit(c);
                }
                else
                {
                    throw new NonDriveException();
                }


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
