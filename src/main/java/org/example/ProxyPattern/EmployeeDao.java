package org.example.ProxyPattern;

public interface EmployeeDao {

    void getEmployeeById(int empId) throws Exception;
    void createEmployee(EmployeeObj obj) throws Exception;
}
