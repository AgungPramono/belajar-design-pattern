/*
 *  BankAccountDemo.java
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
public class BankAccountDemo {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount.Builder("12345")
                .atBranch("Surabaya")
                .openingBalance(new BigDecimal("100000"))
                .atRate(new BigDecimal("20000"))
                .withOwner("Agung Pramono")
                .build();

        BankAccount account2 = new BankAccount.Builder("77785")
                .atBranch("Jakarta")
                .openingBalance(new BigDecimal("1000000"))
                .atRate(new BigDecimal("50000"))
                .withOwner("Sigit")
                .build();

        showAccount(account1);
        showAccount(account2);

    }

    public static void showAccount(BankAccount account) {
        System.out.println("Account name : " + account.getOwner());
        System.out.println("Account number : " + account.getAccountNumber());
        System.out.println("Account Branch : " + account.getBranch());
        System.out.println("Account Balance : " + account.getBalance());
        System.out.println("Account rate : " + account.getInterestRate() + "\n");
    }
}
