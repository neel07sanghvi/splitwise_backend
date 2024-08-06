package com.splitwise.dto;

import java.util.Set;

public class GroupDTO {
    private String name;
    private Set<Long> memberIds;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Long> getMemberIds() {
        return this.memberIds;
    }

    public void setMemberIds(Set<Long> memberIds) {
        this.memberIds = memberIds;
    }
}
