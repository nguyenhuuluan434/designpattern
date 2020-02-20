package com.lsa.design_pattern.designpattern.proxy;

import lombok.Builder;

import java.util.List;

@Builder
public class User {
    private List<String> privileges;

    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }
}
