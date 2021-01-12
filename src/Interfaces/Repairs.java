package Interfaces;

import Abstract.Object;
import Classes.Car;


public interface Repairs
{
     void fix(Car c);
     void checkFixingProgress(Car c);
     void startFixing(Object o);
}

