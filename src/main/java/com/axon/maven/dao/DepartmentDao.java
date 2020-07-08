package com.axon.maven.dao;

import com.axon.maven.entities.Department;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DepartmentDao extends BaseDao {
	
	public List<Department> getAll() {
		return getSession().createQuery("FROM Department").list();
	}
}
