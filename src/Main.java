import animal.Animal;
import animal.Eagle;
import animal.Shark;
import animal.Turtle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Animal eagle1 = new Eagle("burkut1",10);
        Animal shark1 = new Shark("akula1",20);
        Animal turtle1 = new Turtle("tashbaka1",50);
        Animal eagle2 = new Eagle("burkut2",12);
        Animal shark2 =new Shark("burkut2",23);
        Animal turtle2 = new Turtle("tashbaka2",54);
        
        Animal[] animals = {eagle1,shark1,turtle1,eagle2,turtle2,shark2};
        for (Animal animal:animals ) {
            animal.act();
            if (animal.getClass().getName().equals("animal.Eagle")){
                ((Eagle)animal).fly();
            } else if (animal.getClass().getName().equals("animal.Shark")) {
                ((Shark)animal).attack();
            } else if (animal.getClass().getName().equals("animal.Turle")) {
                ((Turtle)animal).swim();
            }
        }

        Shark[] sharks = new Shark[10];
        int s = 0;
        Eagle[] eagles = new Eagle[10];
        int e = 0;
        Turtle[] turtles = new Turtle[10];
        int t = 0;
        for (Animal animal:animals) {
            if( animal instanceof Shark){
                sharks[s]= (Shark) animal;
                s++;
            } else if (animal instanceof Turtle) {
                turtles[t]=(Turtle)animal;
                t++;
            } else if (animal instanceof Eagle) {
                eagles[e]=(Eagle)animal;
                e++;
            }
        }

        System.out.println(Arrays.toString(sharks));
        System.out.println(Arrays.toString(eagles));
        System.out.println(Arrays.toString(turtles));
    }
}