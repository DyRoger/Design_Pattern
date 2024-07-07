package InterfaceCode;

public class WebDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Getting salary of WebDeveloper");
        return 30000;
    }
    
}
