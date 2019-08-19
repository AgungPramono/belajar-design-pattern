package com.agung.pattern.builder;

public class ConfigDemo {
    public static void main(String[] args) {
        Config config1 = Config.builder()
                .ip("192.168.0.1")
                .build();

        System.out.println(config1.getIp() + " "+config1.getDns());
    }
}
