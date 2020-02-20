package com.lsa.design_pattern.designpattern.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

public class DynamicDataServiceProxy implements InvocationHandler {

    private final DataService dataService;
    private final User user;

    public DynamicDataServiceProxy(DataService dataService, User user) {
        this.dataService = dataService;
        this.user = user;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Authorized authoried = method.getDeclaredAnnotation(Authorized.class);
        if (Objects.nonNull(authoried)) {
            String[] allowedPrivileges = authoried.allowed();
            if (isAllowed(allowedPrivileges))
                return method.invoke(dataService, args);
            else
                return null;
        }
        return method.invoke(dataService, args);
    }


    private boolean isAllowed(String[] allowedPrivileges) {
        if (Objects.isNull(allowedPrivileges) || allowedPrivileges.length <= 0)
            return false;
        for (String allowedPrivilege : allowedPrivileges)
            if (user.getPrivileges().contains(allowedPrivilege))
                return true;
        return false;
    }
}
