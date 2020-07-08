package com.axon.maven.service;

import com.axon.maven.dao.EmployeeDao;
import com.axon.maven.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    public void delete(int id) {
        employeeDao.delete(id);
    }

    public Employee get(int id) {
        return employeeDao.get(id);
    }

    public void saveOrUpdate(Employee employee) {
        employeeDao.saveOrUpdate(employee);
    }
}
