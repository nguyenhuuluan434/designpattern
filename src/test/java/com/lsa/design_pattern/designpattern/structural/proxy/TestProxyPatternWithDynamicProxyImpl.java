package com.lsa.design_pattern.designpattern.structural.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;
import java.util.ArrayList;

public class TestProxyPatternWithDynamicProxyImpl {

    @Test
    public void TestDynamicProxy() {
        DataService dataService = new DataServiceImpl();

        User readOnlyUser = User.builder().privileges(new ArrayList<String>() {{
            add("read");
        }}).build();
        DataService dataServiceProxy = getDynamicProxy(dataService, readOnlyUser);
        dataServiceProxy.read();
        dataServiceProxy.write();
        dataServiceProxy.update();
        dataServiceProxy.delete();

        System.out.println("############ admin user ###########");
        User adminUser = User.builder().privileges(new ArrayList<String>() {{
            add("read");
            add("update");
            add("delete");
            add("write");
        }}).build();
        dataServiceProxy = getDynamicProxy(dataService, adminUser);
        dataServiceProxy.read();
        dataServiceProxy.update();
        dataServiceProxy.delete();
        dataServiceProxy.write();

    }

    private static DataService getDynamicProxy(DataService dataService, User user) {
        return (DataService)
                Proxy.newProxyInstance(
                        dataService.getClass().getClassLoader(),
                        dataService.getClass().getInterfaces(),
                        new DynamicDataServiceProxy(dataService, user));
    }

}
