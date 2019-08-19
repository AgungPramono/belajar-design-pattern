/*
 *  Payment.java
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
public interface Payment {

    String getNomorKartu();

    String getNama();

    BigDecimal getSaldo();

    void setNomorKartu(String noKartu);

    void setNama(String nama);

    void setSaldo(BigDecimal saldo);

}
