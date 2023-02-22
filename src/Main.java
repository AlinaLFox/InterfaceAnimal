public class Main {
    public static void main(String[] args) {

        Elephant elephant = new Elephant();
        elephant.eats();
        elephant.moves();
        elephant.sleeps();
        int sleepDuration = Animal.sleepDuration();

        Elephant elephant2 = new Elephant();
        elephant2.foodType();
        elephant2.canBeEatenBy();

        System.out.println("Elephants sleep mostly at night for " + sleepDuration + " hours.");
    }
}