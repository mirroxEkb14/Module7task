public interface Staff {
    void helpStudent(Student student);
    default void giveMaterials() {
        System.out.println("You need help? Well, it can help you: https://habr.com");
    }
}
