package com.agung.pattern.builder;

public class CustomerBuilder {
    private String id;
    private String name;
    private Integer age;
    private String address;

    public static class Builder{
        private String id;
        private String name;
        private Integer age;
        private String address;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder age(Integer age){
            this.age = age;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public CustomerBuilder build(){
            return new CustomerBuilder(this);
        }
    }

    private CustomerBuilder(Builder builder){
        name = builder.name;
        age = builder.age;
        address = builder.address;
        id = builder.id;
    }

}
