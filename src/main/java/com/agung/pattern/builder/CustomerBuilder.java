package com.agung.pattern.builder;

public class CustomerBuilder {
    private String id;
    private String name;
    private Integer age;
    private String address;

    public static class builder {
        private String id;
        private String name;
        private Integer age;
        private String address;

        /**
         * cunstructor digunakan jika ada nilai yg sifatnya mandatory
         * @param id
         * @return
         */
//        public builder(String id){
//            this.id = id;
//        }

        public builder id(String id){
            this.id = id;
            return this;
        }

        public builder name(String name){
            this.name = name;
            return this;
        }

        public builder age(Integer age){
            this.age = age;
            return this;
        }

        public builder address(String address){
            this.address = address;
            return this;
        }

        public CustomerBuilder build(){
            return new CustomerBuilder(this);
        }
    }

    private CustomerBuilder(builder builder){
        name = builder.name;
        age = builder.age;
        address = builder.address;
        id = builder.id;
    }

}
