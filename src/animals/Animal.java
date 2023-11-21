package animals;

import data.ColorData;

public abstract class Animal {

    private String name = "";
    private int age = -1;
    private int weight = -1;
    private ColorData color = null;

//public Animal(int age, String name, int weight, ColorData colorData) {
//    this.name = name;
//    this.age = age;
//    this.weight = weight;
//    this.color = colorData;
//
//}

  public void setName(String name) {
      this.name = name;
  }

  public int setAge(){
       this.age =  age;
  }

  public int setWeight() {
      this.weight = weight;
  }

  public ColorData setColor() {
      this.color = color;
  }

  public String getName() {
      return name;
  }
  public int getAge() {
      return age;
  }
  public int getWeight() {
      return weight;
  }
  public ColorData getColor() {
      return color;
  }
    public String toString() {
      return String.format("Привет! Меня зовут %s, мне %d %s, я вешу - %d кг, мой цвет - %s",
              this.name,
              this.age,
              getYearPadej(),
              this.weight,
              this.color.getName());
    }

    public String getYearPadej() {

    }

 }
