package com.axon.maven.service;

import com.axon.maven.dao.DepartmentDao;
import com.axon.maven.entities.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    private DepartmentDao departmentDao;

    @Autowired
    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }

    public List<Department> getAll() {
        return departmentDao.getAll();
    }
}
