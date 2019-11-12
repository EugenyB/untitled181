package animals;

import main.Running;

import java.util.Objects;

public class Dog implements Running {
    public final static int LEGS = 4;
    private String name;
    private double speed;
    private int age;

    public Dog(String name, double speed, int age) {
        this.name = name;
        this.speed = speed;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Double.compare(dog.speed, speed) == 0 &&
                age == dog.age &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", age=" + age +
                '}';
    }
}
