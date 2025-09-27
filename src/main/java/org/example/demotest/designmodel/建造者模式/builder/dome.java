package org.example.demotest.designmodel.建造者模式.builder;

public class dome {
    public static void main(String[] args) {
        //User user = User.builder().name("张三").Age(18).build();

        String sql = SQL.builder(SQL.SqlType.SELECT).columns("*").table("user").where("id=1").buildSql();
        System.out.println(sql);

        String updateSql = SQL.builder(SQL.SqlType.UPDATE).table("user").param("name","张三").param("age","three").where("sex = man").buildSql();
        System.out.println(updateSql);
    }
}
