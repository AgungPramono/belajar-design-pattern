package com.agung.pattern.builder;

import lombok.Builder;
import lombok.Data;

/**
 * Demo builder pattern menggunakan library lombok
 * @author agung
 */

@Builder
@Data
public class Config {
    private String ip;
    private String hostId;
    private String dns;
}
