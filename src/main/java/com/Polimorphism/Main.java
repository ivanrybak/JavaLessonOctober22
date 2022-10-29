package com.Polimorphism;

public class Main {
    void useCar(Car car){                //создали метод в котором будет использоваться машина
        System.out.println("num doors= "+car.getNumDoors());
        car.driving();

    }
    public static void main(String[] args) {
Main main=new Main();
main.useCar(new Car());    //при вызове метода использовать машину, выполняются условия и функции класса машина т.е.водить и 4 двери
main.useCar(new Toyota()); //при вызове метода использовать Тойоту, выполняются функции класса тойота, т.е. водить и 2 двери
    }
}
