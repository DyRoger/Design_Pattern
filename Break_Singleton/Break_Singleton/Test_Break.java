package Break_Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test_Break{
    
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Employee employee = Employee.getEmployeeThreadSafeOptimized();
        System.out.println("Hash Code :: EMP1 "+ employee.hashCode());

        //Get instance of the class
       Constructor<Employee> constructor =  Employee.class.getDeclaredConstructor();
       // Set the constructor accessibility true
       constructor.setAccessible(true);
       // Create a new instance of the class.
       Employee newEmployee =  constructor.newInstance();
       System.out.println("Hash Code :: NEW_EMP "+ newEmployee.hashCode());
    }
}
