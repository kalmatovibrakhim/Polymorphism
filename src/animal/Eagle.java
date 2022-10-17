package animal;

public class Eagle extends Animal{
    public Eagle() {
    }

    public Eagle(String name, int age) {
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

    public void fly(){
      System.out.println("eagle fly");
    }
    @Override
    public void act() {
        System.out.println("eagle fly");
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}';
    }
}
