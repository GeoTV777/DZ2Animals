package animals.fiying;

import animals.Animal;
import data.ColorData;

public class Duck extends Animal implements IFly {

    public Duck(int age, String name, int weight, ColorData colorData) {
        super(age, name, weight, colorData);
    }

    @Override
    public void say() {
        System.out.println("Кря");
    }

    @Override
    public void fiy() {

    }
}
