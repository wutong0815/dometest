package org.example.demotest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class test02 {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        JSONObject jsonObject = new JSONObject();
        ArrayList<info> list = new ArrayList<>();
        try {
            jsonObject.put("name", "John");
            jsonObject.put("age", 30);
            jsonObject.put("city", "New York");
            jsonObject.put("isStudent", true);
            jsonObject.put("grades", new int[]{90, 85, 95});
            jsonObject.put("address", new JSONObject()
                    .put("street", "123 Main St")
                    .put("city", "New York")
                    .put("state", "NY"));
            list.add(new info("John", 30, "New York"));
            jsonObject.put("info", list);
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        System.out.println(jsonObject);
    }


    public static class info {
        private String privateName;
        private int privateAge;
        private String privateCity;

        public info() {
            this.privateName = "John";
            this.privateAge = 30;
            this.privateCity = "New York";
        }

        public info(String name, int age, String city) {
            this.privateName = name;
            this.privateAge = age;
            this.privateCity = city;
        }
        public String getName() {
            return privateName;
        }

        public void setName(String name) {
            this.privateName = name;
        }
        public int getAge() {
            return privateAge;
        }
        public void setAge(int age) {
            this.privateAge = age;
        }
        public String getCity() {
            return privateCity;
        }
        public void setCity(String city) {
            this.privateCity = city;
        }
        @Override  // 添加 @Override 注解，明确重写父类方法
        public String toString() {  // 修改为正确的 String 返回类型
            return "Info{name='" + privateName + "', age=" + privateAge + ", city='" + privateCity + "'}";
        }
    }
}
