package task3;

import task2.MyAnnotation;
import task2.Task2;
import task2.TestAnnotation;

public class Task3 {
    public static void main(String[] args) {
        Task3.showAnnotationValue(Task2.class);
    }

    public static void showAnnotationValue(Class clazz) {
        TestAnnotation.getAnnotatedFields(clazz).stream()
                .map(s -> s.getAnnotationsByType(MyAnnotation.class))
                .forEach(s -> System.out.println(s[0].value()));
    }
}
