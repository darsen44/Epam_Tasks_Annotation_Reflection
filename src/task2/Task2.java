package task2;

public class Task2 {
    @MyAnnotation("Dariy")
    String name;
    @MyAnnotation("Senyshyn")
    String surname;

    public Task2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
