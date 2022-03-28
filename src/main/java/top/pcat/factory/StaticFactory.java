package top.pcat.factory;

import top.pcat.entity.Employee;

public class StaticFactory {

    public static Employee getEmp(String empName){
        Employee employee = new Employee();
        employee.setEmpName(empName);
        return employee;
    }
}
