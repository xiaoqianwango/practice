package per.smart.chapter1.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import per.smart.chapter1.model.Customer;
import per.smart.chapter1.service.CustomerService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by wangxiaoqian on 2018/6/26.
 */
public class CustomerServiceTest {
    private final CustomerService customerService;
    @Before
    public void init(){
        //TODO 初始化数据库
    }

    public CustomerServiceTest() {
        customerService = new CustomerService();
    }

    @Test
    public void getCustomerListTest() throws Exception {
        List<Customer> customers = customerService.getCustomerList();
        Assert.assertEquals(2,customers.size());
    }

    @Test
    public void getCustomerTest() throws Exception {
        long id = 1;
        Customer customer = customerService.getCustomer(id);
        Assert.assertNotNull(customer);
    }

    @Test
    public void createCustomerTest() throws Exception {
        Map<String ,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("name","customer3");
        fieldMap.put("contact","John");
        fieldMap.put("telephone","16423212345");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void updateCustomerTest() throws Exception {
        Map<String ,Object> fieldMap = new HashMap<String,Object>();
        fieldMap.put("id","3");
        fieldMap.put("name","customer01");
        fieldMap.put("contact","John");
        boolean result = customerService.updateCustomer(fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest() throws Exception {
        long id = 3;
        boolean result = customerService.deleteCustomer(id);
        Assert.assertTrue(result);
    }

}