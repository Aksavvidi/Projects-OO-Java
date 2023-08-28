package gr.aueb.cf.ch14.reflect;

import java.lang.reflect.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            //load class
            Class<?> clazz = Class.forName("gr.aueb.cf.ch14.reflect.Teacher");

            // get default Constructor and create an instance
            Constructor<?> defaultCtr = clazz.getDeclaredConstructor();//declared because it is private
            defaultCtr.setAccessible(true);//για να εχω προσβαση
            Teacher teacher1 = (Teacher) defaultCtr.newInstance();//create new instance (Teacher)

            // get overload Constructor and create an instance
            Constructor<?> longCtr = clazz.getConstructor(Long.class);//θελω τον constructor me thn uπογραφη(παραμετρο) Long
            Teacher teacher2 = (Teacher) longCtr.newInstance(10L);

            Method sayHello = clazz.getMethod("sayHello");
            sayHello.invoke(teacher1);

            Method saySomething = clazz.getMethod("saySomething", String.class);
            saySomething.invoke(teacher2, "Coding Factory");

            System.out.println();

            Constructor<?> ctrList = clazz.getDeclaredConstructor();
//            System.out.println(Arrays.toString(ctrList));

            System.out.println();

            Method[] mList = clazz.getDeclaredMethods();
            for (Method m : mList){
                System.out.println("Method name: " + m.getName());
                int mod = m.getModifiers();
                System.out.println(Modifier.toString(mod));
            }
            System.out.println();

            Field[] fList = clazz.getDeclaredFields();
            for (Field f : fList) {
                System.out.println("Field name: " + f.getName());
                int mod = f.getModifiers();
                System.out.println(Modifier.toString(mod));
            }

        }catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
