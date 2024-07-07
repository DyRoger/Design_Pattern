package InterfaceCode;

public class AndroidDeveloper implements Employee {

    @Override
    public int getSalary() {
        System.out.println("getting salary of android developer");
        return 500000;
    }

}
