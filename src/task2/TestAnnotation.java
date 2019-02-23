package task2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestAnnotation {
    public static void main(String[] args) {
        TestAnnotation.printAnnotatedFields(getAnnotatedFields(Task2.class));
    }

    public static List<Field> getAnnotatedFields(Class clazz){
        List<Field> fields = new ArrayList<>(Arrays.asList(clazz.getDeclaredFields()));
        return fields.stream()
                .filter(s -> s.isAnnotationPresent(MyAnnotation.class))
                .collect(Collectors.toList());
    }

    private static void printAnnotatedFields(List<Field> fields){
        fields.forEach(System.out::println);
    }
}
