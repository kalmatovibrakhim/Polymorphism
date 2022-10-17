package animal;

public class Turtle extends Animal{
    public Turtle() {
    }

    public Turtle(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public void swim(){
        System.out.println("turtle swim");
    }
    @Override
    public void act() {
        System.out.println("turtle swim");
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
