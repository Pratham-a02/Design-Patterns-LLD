package org.example.ProxyPattern;

public class EmployeeDaoImpl implements EmployeeDao{


    @Override
    public void getEmployeeById(int empId) {
        System.out.println("Fetching employee detail with id: " + empId);
    }

    @Override
    public void createEmployee(EmployeeObj obj) {
        System.out.println("Created employee successfully");
    }
}
