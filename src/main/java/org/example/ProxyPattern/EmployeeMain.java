package org.example.ProxyPattern;

public class EmployeeMain {

    public static void main(String[] args) throws Exception {
        // Proxy Design Pattern

        EmployeeProxy proxy = new EmployeeProxy("CLIENT");
        proxy.getEmployeeById(1);
        proxy.createEmployee(new EmployeeObj());
    }
}
