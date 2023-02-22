public interface Animal {
    void eats();
    void moves();

    static int sleepDuration() {
        return 2;
    }
    default void sleeps() {
        System.out.println("Sleeps standing or lying down if in groups");
    }
}
