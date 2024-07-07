import InterfaceCode.AndroidDeveloper;
import InterfaceCode.Employee;
import InterfaceCode.EmployeeFactory;

public class TestEmployee {
    public static void main(String[] args) {
        // In factory design pattern we do not create in a normal way.
        // ex. 
        // Employee emp = new AndroidDeveloper();

        // In factory design pattern we do like this
        Employee employee1 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");

        System.out.println("EMployee 1 salary :: "+ employee1.getSalary());

        Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");

        System.out.println("EMployee 2 salary :: "+ employee2.getSalary());
    
    }
}
