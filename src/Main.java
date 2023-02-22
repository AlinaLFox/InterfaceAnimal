public class Main {
    public static void main(String[] args) {

        Animal elephant = new Elephant();
        elephant.eats();
        elephant.moves();
        elephant.sleeps();
        int sleepDuration = Animal.sleepDuration();

        Erbivor elephant2 = new Elephant();
        elephant2.foodType();
        elephant2.canBeEatenBy();

        System.out.println("Elephants sleep mostly at night for " + sleepDuration + " hours.");
    }
}