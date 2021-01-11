package Classes;

import Abstract.Object;
import Interfaces.Repairs;

public class Car extends Object
{
    private int hp;


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

    public  void getRepair(int hp)
    {
        setHp(getHp() + hp);
        System.out.println("Машина починилась на " + hp + " пунктов");
    }
    public  void setHp(int hp)
    {
       this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
}
