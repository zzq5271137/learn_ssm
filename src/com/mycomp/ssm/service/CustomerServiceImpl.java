package com.mycomp.ssm.service;

import com.mycomp.ssm.domain.Customer;
import com.mycomp.ssm.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
@Transactional // 启用Spring的事务管理
public class CustomerServiceImpl implements ICustomerService {

    // 使用Spring注入dao对象
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void saveCustomer(Customer customer) {
        // 把数据保存到数据库
        System.out.println("Service: 调用dao层保存数据---" + customer);

        // 调用dao层保存数据
        customerMapper.insertCustomer(customer);
        System.out.println("保存完成");
    }

}
