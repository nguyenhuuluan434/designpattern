package com.lsa.design_pattern.designpattern.proxy;

public interface DataService {
    @Authorized(allowed = "delete")
    void delete();

    @Authorized(allowed = "read")
    void read();

    @Authorized(allowed = "update")
    void update();

    @Authorized(allowed = "write")
    void write();

}
