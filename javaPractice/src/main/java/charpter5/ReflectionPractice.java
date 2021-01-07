package charpter5;

import java.lang.reflect.*;

public class ReflectionPractice {
    public static void main(String args[]) throws IllegalAccessException, InstantiationException {
        Employee employee = new Employee("zhai", 1000);

        System.out.println("Class class ====================================================");
        // two diff method to get the Class of object.
        Class<? extends Employee> employeeClass = employee.getClass();
        Class<Employee> employeeClass1 = Employee.class;

        // jvm will manage only one Class object for each class, so we can use "=="
        System.out.println(employeeClass == employeeClass1);
        try {
            employeeClass.getDeclaredField("salary");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        try {
            Class<?> employeeClass2 = Class.forName("charpter5.Employee");
            System.out.println("Class.forName: " + employeeClass2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //deprecated, create a new instance
//        employeeClass.newInstance();
        System.out.println("Constructor class ===========================================");
        //There are three class in  java.lang.reflect , which are Field, Method and Constructor
        Constructor<?>[] allPublicConstructors = employeeClass.getConstructors();
        Constructor<?>[] allContructors = employeeClass.getDeclaredConstructors();
        PrintConstructors(allPublicConstructors);

        System.out.println("Field class ==================================================");
        Field[] allPublicFields = employeeClass.getFields();
        Field[] allFields = employeeClass.getDeclaredFields();

        for (Field f : allFields) {
            System.out.println("begin to output fields");
            //set the accessible for current field, otherwise, we can not get the value of private field
            f.setAccessible(true);
            System.out.println(f.get(employee));
        }

        System.out.println("Method class ==================================================");
        Method[] allPublicMethods = employeeClass.getMethods();
        Method[] allMethods = employeeClass.getDeclaredMethods();

    }

    private static void PrintConstructors(Constructor<?>[] allPublicConstructors) throws InstantiationException, IllegalAccessException {
        for(Constructor c : allPublicConstructors){
            System.out.println("begin to output a constructor ========================================");
           System.out.println(c.getName());
           System.out.println(c.getModifiers());
           System.out.println(Modifier.isPublic(c.getModifiers()));
           System.out.println(c.getParameterTypes().length);
           // Returns an array of TypeVariable objects that represent the
            // type variables declared by the generic declaration represented by
            // this GenericDeclaration object,
           System.out.println(c.getTypeParameters().length);

           if(c.getParameterCount() == 2) {
               try {
                   c.newInstance("ding", 2000);
               } catch (InvocationTargetException e) {
                   e.printStackTrace();
               }
           }
        }
    }
}
