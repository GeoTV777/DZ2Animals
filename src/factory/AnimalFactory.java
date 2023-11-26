package factory;

import animals.Animal;
import animals.fiying.Duck;
import animals.quadrupeds.Cat;
import animals.quadrupeds.Dog;
import data.AnimalData;
import data.ColorData;

public class AnimalFactory {
    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData colorData;

    public AnimalFactory(int age, String name, int weight, ColorData colorData){
        this.name = name;
        this.age = age;
        this. weight = weight;
        this.colorData = colorData;
    }

    public Animal create(AnimalData animalData) {
     switch (animalData){
         case CAT:
             return new Cat(this.age, this.name, this.weight, this.colorData);
         case DOG:
             return new Dog(this.age, this.name, this.weight, this.colorData);
         default:
             return new Duck(this.age, this.name, this.weight, this.colorData);
     }


    }
}
