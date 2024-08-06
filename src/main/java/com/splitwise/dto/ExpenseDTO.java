package com.splitwise.dto;

import java.math.BigDecimal;
import java.util.Map;

public class ExpenseDTO {
    private BigDecimal amount;
    private String description;
    private Long paidByUserId;
    private Long groupId;
    private Map<Long, BigDecimal> splits;

    public BigDecimal getAmount() {
        return this.amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPaidByUserId() {
        return this.paidByUserId;
    }

    public void setPaidByUserId(Long paidByUserId) {
        this.paidByUserId = paidByUserId;
    }

    public Long getGroupId() {
        return this.groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Map<Long, BigDecimal> getSplits() {
        return this.splits;
    }

    public void setSplits(Map<Long, BigDecimal> splits) {
        this.splits = splits;
    }
}