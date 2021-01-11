package Interfaces;

import Classes.Car;

public interface Repairs
{
     void fix(Car c);
     void checkFixingProgress(Car c);
     void startFixing(Object o);
}
