package school.management.system.ctx;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private static Map<Class, Object> objects = new HashMap<>();

//    static {
//
//        add(IdGenerator.class, new IdGeneratorImpl());
//
//    }

    public static <T> boolean add(Class key, T value) {
        objects.put(value.getClass(), value);
        return objects.containsKey(value.getClass());
    }

    public static <T> T get(Class c) {
        return (T)objects.get(c);
    }

}