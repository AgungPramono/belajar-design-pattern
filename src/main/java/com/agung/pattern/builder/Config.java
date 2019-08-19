package com.agung.pattern.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Config {
    private String ip;
    private String hostId;
    private String dns;
}
