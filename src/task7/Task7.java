package task7;

import sun.reflect.ConstructorAccessor;
import task5.Task5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task7 {
    private int a;

    public static void main(String[] args) {
        Task7.classInfo(Task7.class);
    }
    private static void classInfo(Class clazz){
        StringBuilder str = new StringBuilder();
        str.append("Class name: ").append(clazz.getName()).append('\n')
           .append("Simple class name: ").append(clazz.getSimpleName()).append('\n')
           .append("Is anonymous: ").append(clazz.isAnonymousClass()).append('\n')
           .append("Is annotation: ").append(clazz.isAnnotation()).append('\n')
           .append("Is array: ").append(clazz.isArray()).append('\n')
           .append("Is enum ").append(clazz.isEnum()).append('\n')
           .append("Is Interface ").append(clazz.isInterface()).append('\n')
           .append("Is Member class ").append(clazz.isMemberClass()).append('\n')
           .append("Is Local class ").append(clazz.isLocalClass()).append('\n')
           .append("Is Primitive ").append(clazz.isPrimitive()).append('\n');

        Constructor[] constructors = clazz.getDeclaredConstructors();
        str.append("\tConstructors:\n");
        for (Constructor c:
             constructors) {
            str.append(c).append('\n');
        }

        Method[] methods = clazz.getDeclaredMethods();
        str.append("\tMethods:\n");
        for (Method m:
             methods) {
            str.append(m).append('\n');
        }

        Field[] fields = clazz.getDeclaredFields();
        str.append("\tFields:\n");
        for (Field f:
             fields) {
            str.append(f).append('\n');
        }

        System.out.println(str);
    }
}
