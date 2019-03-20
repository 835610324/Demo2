package com.qixin.test;

import com.qixin.dao.AccountDaoImpl;
import com.qixin.entity.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by song on 2019/3/12.
 */
public class test1 {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
       /* DataSource dataSource =(DataSource) ac.getBean("dataSource");
        System.out.println(dataSource);*/

        AccountDaoImpl accountDao = (AccountDaoImpl)ac.getBean("accountDao");
        /*Account a = new Account("张三的账户",1000.10);
        accountDao.add(a);*/

       /* Account a=new Account(1,"李四的账户",600.25);
        accountDao.update(a);*/

        //accountDao.delete(2);

        /*Account a = accountDao.sele(1);
        System.out.println(a.getAccountname());*/

       List<Account> li = accountDao.seleall();

        for (Account a:li) {
            System.out.println(a.getAccountname());
        }
    }
}
