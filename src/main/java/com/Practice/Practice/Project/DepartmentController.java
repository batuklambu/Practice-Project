package com.Practice.Practice.Project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    @RequestMapping(path ="/departments")
public List<Department> showDept(){
    return  departmentService.getDeptList();
}

@PostMapping
    @RequestMapping(path = "saveDepartment")
    public String saveDept(@RequestBody Department department){
        String message = departmentService.saveDept(department);
        return message;
}

@DeleteMapping
    @RequestMapping(path = "/{deptId}")
    public String deleteDept(@PathVariable int deptId ){
        String message = departmentService.deleteDept(deptId);
        return message;
    }

@PutMapping
@RequestMapping(path = "/update/{deptId}")
public  String updateDept(@PathVariable int deptId,@RequestBody Department department){
        String message = departmentService.updateDept(deptId,department);
        return message;
    }




}
