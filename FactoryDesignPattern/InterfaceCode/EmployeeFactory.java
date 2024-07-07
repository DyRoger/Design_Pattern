package InterfaceCode;

public class EmployeeFactory {
    
    public static Employee getEmployee(String employeetype){
        if(employeetype.trim().equalsIgnoreCase("ANDROID Developer")){
            return new AndroidDeveloper();
        } else if(employeetype.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        } else{
            return null;
        }
    }
}
