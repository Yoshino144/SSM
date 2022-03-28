package top.pcat.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.pcat.entity.Employee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@ContextConfiguration(locations = "classpath:annotation.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class IOCTest {

    @Autowired
    Employee employee;

    @Test
    public void testAutowired() {
        System.out.println(employee.getEmpName());
    }
    
    @Test
    public void getProxy() {

        ClassLoader classLoader = IOCTest.class.getClassLoader();

        Class[] classes = {BaseService.class};

        LoginService loginService = new LoginService();
        BaseService baseService = (BaseService) Proxy.newProxyInstance(classLoader, classes, new LoginServiceProxy(loginService));

        boolean login = baseService.login("E-AA", "888");
        System.out.println(login);
    }
}

class LoginServiceProxy implements InvocationHandler {

    private LoginService loginService;

    public LoginServiceProxy(LoginService loginService) {
        this.loginService = loginService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        boolean result = (boolean) method.invoke(loginService, args);
        if (result) {
            String username = (String) args[0];
            if (username.contains("E")) {
                System.out.println("校验通过");
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
