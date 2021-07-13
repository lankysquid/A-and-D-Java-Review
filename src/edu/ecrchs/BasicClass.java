package edu.ecrchs;

public class BasicClass {

    /**
     * Remember to keep all class level variables as private, even static variables.
     * If you are using a final (unchangeable) static variable then, you MAY make it
     * public or protected.
     */
    private int num;
    private static int counter = 0;

    /**
     * Unlike in AP CS we will now only create the constructors that we need,
     * ignoring the default if we do not want that functionality.
     * @param num
     */
    public BasicClass (int num) {
        this.num = num;
        counter++;
    }

    /**
     * Setters and getters will become more and more important as programs
     * become larger, using an IDE will make writing these much easier.
     * @return
     */
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        counter++;
        this.num = num;
    }

    /**
     * @return counter
     *
     * Though not required by java, it is good practice to use static methods
     * to access static variables to keep things consistent for users.
     */
    public static int getCounter() {
        return counter;
    }
}
