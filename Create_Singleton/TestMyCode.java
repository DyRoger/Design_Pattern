package Create_Singleton;
public class TestMyCode {
    
    public static void main(String[] args) {
        // Test Employee code. Created on singletion pattern
        Employee employee1 = Employee.getEmployee();
        System.out.println("Hash Code of Employee 1 :: "+ employee1.hashCode());

        Employee employee2 = Employee.getEmployee();
        System.out.println("Hash Code of Employee 2 :: "+ employee2.hashCode());
        System.out.println("Result matched status for employee :: "+  employee1.equals(employee2));
         // Test MobilePhone code. Created on singletion pattern with eager way
         MobilePhone mobilePhone1 = MobilePhone.getMobilePhone();
         System.out.println("Hash Code of mobilePhone 1 :: "+ mobilePhone1.hashCode());

      
         MobilePhone mobilePhone2 = MobilePhone.getMobilePhone();
         System.out.println("Hash Code of mobilePhone 2 :: "+ mobilePhone2.hashCode());
         System.out.println("Result matched status for mobile phone :: "+  mobilePhone1.equals(mobilePhone2));
    }
}
