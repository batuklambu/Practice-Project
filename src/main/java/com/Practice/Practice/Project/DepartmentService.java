package com.Practice.Practice.Project;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DepartmentService {


    private List<Department> deptList = new ArrayList();

    public DepartmentService() {
    }

    public List<Department> addDept(Department department) {
        this.deptList.add(department);
        return this.deptList;
    }

    public List<Department> getDeptList() {
        return this.deptList;
    }

    public String saveDept(Department department) {
        this.deptList.add(department);
        return "The department added successfully";
    }

    public String deleteDept(int deptId) {
        for (int i = 0; i < this.deptList.size(); ++i) {
            if (((Department) this.deptList.get(i)).getId() == deptId) {
                this.deptList.remove(i);
                return "Department deleted sucessfully";
            }
        }

        return "Department not found";
    }

    public String updateDept(int deptId, Department newerDept) {
        for (int i = 0; i < this.deptList.size(); ++i) {
            if (((Department) this.deptList.get(i)).getId() == deptId) {
                ((Department) this.deptList.get(i)).setName(newerDept.getName());
                return "Department updated sucessfully";
            }
        }

        return "Department not found";


    }
}