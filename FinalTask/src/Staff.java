public interface Staff {
    void helpStudent(Student student); // not used
    default void giveMaterials() { // not used
        System.out.println("You need help? Well, it can help you: https://habr.com");
    }
}
