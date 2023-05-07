package com.leanring.springDemo.enterprise.bussiness;

import com.leanring.springDemo.enterprise.model.Employee;
import org.springframework.stereotype.Component;

public class BusinessService {

    public Employee calculateSum(){
        return new Employee("hrishi",24);
    }
}
