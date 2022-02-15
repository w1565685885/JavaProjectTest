package com.atguigu.service;

import com.atguigu.bean.Customer;

//等价于CustomerList
public class CustomerService {

    /**
     * 添加客户
     *
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer) {


        return true;
    }

    /**
     * 根据编号查询 用户
     *
     * @param id
     * @return
     */
    public Customer getCustomerById(int id) {

        return null;
    }
    /**
     * 更新指定编号的客户
     *
     * @param id
     * @return
     */
    public boolean replaceCustomer(int id, Customer customer) {

        return true;

    }

    public boolean deleteCustomerById(int id){

        return true;
    }

    public Customer[] getAllCustomers(){

        return null;
    }

}
