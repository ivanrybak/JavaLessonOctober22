package com.Polimorphism;

public class Car {                //создали класс машина, с методом "водить", с переменной кол-во дверей,
    public void driving(){         //и методом getNumDoors -возвращающим это кол-во дверей
        System.out.println("Driving");
    }
    int numDoors =4;
    int getNumDoors (){
        return numDoors;
    }
}
