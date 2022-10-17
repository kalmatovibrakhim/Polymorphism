package animal;

public class Shark extends Animal{
    public Shark() {
    }

    public Shark(String name, int age) {
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

    public void attack(){
        System.out.println("shark attack");
    }
    @Override
    public void act(){
        System.out.println("shark attack");
    }


    @Override
    public String toString() {
        return "Shark{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
