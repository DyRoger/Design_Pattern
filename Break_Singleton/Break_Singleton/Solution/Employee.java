package Break_Singleton.Solution;
/**
 * Solution for preventing singleton pattern using reflection api
 * 
 */
public class Employee{

    private static Employee employee = null;
    private Employee(){
        // Make the constructor private. So that no one can access the constructor to create the object.
        // Solution for reflection api
        if(employee!=null){
            throw new RuntimeException("You are trying to break singleon Pattern");
        }
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