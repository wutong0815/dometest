package org.example.demotest.designmodel.建造者模式.builder;

public class User {
    private String name;
    private int age;


    public static Builder builder() {
        return new Builder();
    }
    public static class Builder {
        private String name;
        private int age;

        private Builder() {
        }



        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

//        public Builder setName(String name) {
//            user.setName(name);
//            return this;
//        }
//        public Builder setAge(int age) {
//            user.setAge(age);
//            return this;
//        }
        public User build() {
            User user = new User();
            user.setName(this.name);
            user.setAge(this.age);
            if (age < 18 && "Tom".equals(name)) {
                throw new IllegalArgumentException("Tom must be 18 years old");
            }
            if (age >18 && "Jerry".equals(name)) {
                throw new IllegalArgumentException("Jerry must be 18 years old");
            }

            return user;
        }
    }

    private void setName(String name) {
        this.name = name;
    }
    private void setAge(int age) {
        this.age = age;
    }

    public int getAge(int age) {
        return age;
    }

    public String getName(String name) {
        return name;
    }


//    public boolean chech(){
//        if (age < 18 && "Tom".equals(name)) {
//            return false;
//        }
//        if (age >18 && "Jerry".equals(name)) {
//            return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        User user = new User();
//        user.setName("Tom");
//        user.setAge(18);
//        if (user.chech()) {
//            System.out.println("通过");
//        } else {
//            System.out.println("不通过");
//        }
//    }

}
