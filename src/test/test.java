package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: cjq
 * @time: 2020/5/8 13:38
 */
public class test {
    /*public static void main(String[] args) {

        *//***
         * 简单的来说就是：当第二位和第三位操作数的类型相同时，则三目运算符表达式
         * 的结果和这两位操作数的类型相同。当第二，第三位操作数分别为基本类型和该基本
         * 类型对应的包装类型时，那么该表达式的结果的类型要求是基本类型。
         *
         * 当第二位和第三位表达式都是包装类型的时候，该表达
         * 式的结果才是该包装类型，否则，只要有一个表达式的类型是基本数据类型，则表达
         * 式得到的结果都是基本数据类型。如果结果不符合预期，那么编译器就会进行自动拆
         * 箱。（即 Java 开发手册中总结的：只要表达式 1 和表达式 2 的类型有一个是基本类
         * 型，就会做触发类型对齐的拆箱操作，只不过如果都是基本类型也就不需要拆箱了。）
         *//*
       *//* boolean flag=true;
        boolean simpleBoolean=false;
        Boolean nullBoolean=null;
        Boolean x=flag?nullBoolean :simpleBoolean;
        System.out.println(x);*//*
        Map<String,Boolean> map = new HashMap<String, Boolean>();
        Boolean b = (map!=null ? map.get("Hollis") : false);
        System.out.println(b);
    }*/

  /*  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Map<String ,String > map=new HashMap<>();
        map.put("hollis","holis");
        Class<?> mapType=map.getClass();
        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity:"+capacity.invoke(map));
        Field size = mapType.getDeclaredField("size");
        size.setAccessible(true);
        System.out.println("size:"+size.get(map));
    }*/
  /*public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<String, String>(1);
        Class<?> mapType = map.getClass();
        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity : " + capacity.invoke(map));


        *//*Map<String, String> map = new HashMap<String, String>(7);
        Class<?> mapType = map.getClass();
        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity : " + capacity.invoke(map));*//*


       *//* Map<String, String> map = new HashMap<String, String>(9);
        Class<?> mapType = map.getClass();
        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity : " + capacity.invoke(map));*//*
    }*/
    /*public static void main(String[] args) throws Exception {
        Map<String, String> map = new HashMap<>();
        map.put("hollis1", "hollischuang");
        map.put("hollis2", "hollischuang");
        map.put("hollis3", "hollischuang");
        map.put("hollis4", "hollischuang");
        map.put("hollis5", "hollischuang");
        map.put("hollis6", "hollischuang");
        map.put("hollis7", "hollischuang");
        map.put("hollis8", "hollischuang");
        map.put("hollis9", "hollischuang");
        map.put("hollis10", "hollischuang");
        map.put("hollis11", "hollischuang");
        map.put("hollis12", "hollischuang");
        Class<?> mapType = map.getClass();
//        Method capacity = mapType.getDeclaredMethod("capacity");
//        capacity.setAccessible(true);
//        System.out.println("capacity : " + capacity.invoke(map));
//        Field size = mapType.getDeclaredField("size");
//        size.setAccessible(true);
//        System.out.println("size : " + size.get(map));
//        Field threshold = mapType.getDeclaredField("threshold");
//        threshold.setAccessible(true);
//        System.out.println("threshold : " + threshold.get(map));
//        Field loadFactor = mapType.getDeclaredField("loadFactor");
//        loadFactor.setAccessible(true);
//        System.out.println("loadFactor : " + loadFactor.get(map));
        map.put("hollis13", "hollischuang");


        Method capacity = mapType.getDeclaredMethod("capacity");
        capacity.setAccessible(true);
        System.out.println("capacity : " + capacity.invoke(map));
        Field size = mapType.getDeclaredField("size");
        size.setAccessible(true);
        System.out.println("size : " + size.get(map));
        Field threshold = mapType.getDeclaredField("threshold");
        threshold.setAccessible(true);
        System.out.println("threshold : " + threshold.get(map));
        Field loadFactor = mapType.getDeclaredField("loadFactor");
        loadFactor.setAccessible(true);
        System.out.println("loadFactor : " + loadFactor.get(map));
    }*/
    /*public static void main(String[] args) {
        int aHundredMillion = 10000000;
        Map<Integer, Integer> map = new HashMap<>();
        long s1 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map.put(i, i);
        }
        long s2 = System.currentTimeMillis();
        System.out.println(" 未初始化容量，耗时 ： " + (s2 - s1));
        Map<Integer, Integer> map1 = new HashMap<>(aHundredMillion / 2);
        long s5 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map1.put(i, i);
        }
        long s6 = System.currentTimeMillis();
        System.out.println(" 初始化容量 5000000，耗时 ： " + (s6 - s5));
        Map<Integer, Integer> map2 = new HashMap<>(aHundredMillion);
        long s3 = System.currentTimeMillis();
        for (int i = 0; i < aHundredMillion; i++) {
            map2.put(i, i);
        }
        long s4 = System.currentTimeMillis();
        System.out.println(" 初始化容量为 10000000，耗时 ： " + (s4 - s3));
    }*/
    public static Object main(String[] args) {
        String  key=null;
        Object object=null;
        return key==null ? null:object;

    }
    public static Object get(String key) {
        Object object = null;
        return key == null ? null : object;
    }
}