package org.example.ProxyPattern;

public class EmployeeProxy implements EmployeeDao{
    private EmployeeDao employeeDao;
    private String role;

    public EmployeeProxy(String role){
        this.role = role;
        employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void getEmployeeById(int empId) throws Exception {
        if(role.equals("CLIENT") || role.equals("ADMIN")){
            employeeDao.getEmployeeById(empId);
        }
        else{
            throw new Exception("Access Denied");
        }
    }

    @Override
    public void createEmployee(EmployeeObj obj) throws Exception {
        if(role.equals("ADMIN")){
            employeeDao.createEmployee(obj);
        }
        else{
            throw new Exception("Access Denied");
        }
    }
}
