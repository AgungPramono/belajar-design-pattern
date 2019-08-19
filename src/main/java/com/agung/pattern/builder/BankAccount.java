/*
 *  BankAccount.java
 *  Java-Design-Pattern 
 * 
 *  Created by Agung Pramono on 10/09/2018 
 *  Copyright (c) 2018 Java Development. All rights reserved.
 */
package com.agung.pattern.builder;

import java.math.BigDecimal;

/**
 *
 * @author agung
 */
public class BankAccount {

    private String accountNumber;
    private String owner;
    private String branch;
    private BigDecimal balance;
    private BigDecimal interestRate;

    public static class Builder {

        private String accountNumber;
        private String owner;
        private String branch;
        private BigDecimal balance = BigDecimal.ZERO;
        private BigDecimal interestRate = BigDecimal.ZERO;

        public Builder(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(BigDecimal balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(BigDecimal rate) {
            this.interestRate = rate;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    private BankAccount(Builder builder) {
        accountNumber = builder.accountNumber;
        owner = builder.owner;
        branch = builder.branch;
        balance = builder.balance;
        interestRate = builder.interestRate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }


}
