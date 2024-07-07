package Break_Singleton;
/**
 * Create a class in singleton pattern.
 * With Lazy initialization.
 * with Thread safe and w/o Thread safe method.
 */
public class Employee{

    private static Employee employee = null;
    private Employee(){
        // Make the constructor private. So that no one can access the constructor to create the object.
    }

    //Create one public static method to get the object of this class.
    public static Employee getEmployee(){

        
        if(employee == null){
            employee = new Employee();
        }
        return employee;
    }
    // Thread safe
    public synchronized static Employee getEmployeeThreadSafe(){

        // lots of code
        if(employee == null){
            employee = new Employee();
        }
        //lots of code
        return employee;
    }

    // Thread Safe in a optimized way
    public synchronized static Employee getEmployeeThreadSafeOptimized(){

        // lots of code
        if(employee==null){
            synchronized(Employee.class){
                if(employee == null){
                    employee = new Employee();
                }
            }
        }
        
        //lots of code
        return employee;
    }
}