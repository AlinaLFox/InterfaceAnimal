public class Elephant extends Erbivor implements Animal {

    @Override
    public void eats() {
        System.out.println("Is eating ...");
    }

    @Override
    public void moves() {
        System.out.println("Moves ...");
    }

    @Override
    void foodType() {
        System.out.println("Prefers greens and sweet fruits.");
    }
}
