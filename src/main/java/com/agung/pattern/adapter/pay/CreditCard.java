/*
 *  CreditCard.java
 *  Java-Design-Pattern 
 * 
 *  Created by Agung Pramono on 09/09/2018 
 *  Copyright (c) 2018 Java Development. All rights reserved.
 */

package com.agung.pattern.adapter.pay;

import java.math.BigDecimal;

/**
 *
 * @author agung
 */
public class CreditCard implements Payment {

    private String nomorKartu;
    private String nama;
    private BigDecimal saldo;

    @Override
    public String getNomorKartu() {
        return this.nomorKartu;
    }

    @Override
    public String getNama() {
        return this.nama;
    }

    @Override
    public BigDecimal getSaldo() {
        return this.saldo;
    }

    @Override
    public void setNomorKartu(String noKartu) {
        this.nomorKartu = noKartu;
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

}
