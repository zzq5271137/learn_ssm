package com.mycomp.ssm.web.controller;

import com.mycomp.ssm.domain.Customer;
import com.mycomp.ssm.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class CustomerController {

    // 使用Spring注入service对象
    // @Autowired
    @Resource(name = "customerService")
    private ICustomerService customerService;

    @RequestMapping("addcustomer")
    public String addcustomer(Customer customer) {
        // 接收参数
        System.out.println("Controller: 接收参数---" + customer);

        // 调用service层, 把数据保存到数据库
        customerService.saveCustomer(customer);

        return "result";
    }

}
