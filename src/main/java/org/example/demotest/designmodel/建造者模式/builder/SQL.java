package org.example.demotest.designmodel.建造者模式.builder;

import org.example.demotest.designmodel.建造者模式.dome01.Matter;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SQL {

    private SQL() {
    }

    public static SqlBuilder builder(SqlType sqlType) {
        return new SqlBuilder(sqlType);
    }

    public static class SqlBuilder {
        final SqlType sqlType;

        String[] columns;


        String table;

        String where;


        Map<String,String> params = new LinkedHashMap<>();


        private SqlBuilder(SqlType sqlType) {
            this.sqlType = sqlType;
        }

        public SqlBuilder columns(String... columns) {
            this.columns = columns;
            return this;
        }

        public SqlBuilder table(String table) {
            this.table = table;
            return this;
        }
        public SqlBuilder where(String where) {
            this.where = where;
            return this;
        }

        public SqlBuilder param(String key, String value) {
            params.put(key, value);
            return this;
        }

        public String buildSql() {
            StringBuilder sb = new StringBuilder();
            switch (sqlType) {
                case SELECT:
                    sb.append("SELECT ").append(String.join(",", columns)).append(" FROM ").append(table);
                    if (where != null) {
                        sb.append(" WHERE ").append(where);
                    }
                    break;
                case INSERT:
                    sb.append("INSERT INTO ");
                    break;
                case UPDATE:
                    sb.append("UPDATE ").append(table).append(" SET ");
                    String paramsStr = params.entrySet().stream()
                            .map(entry -> entry.getKey() + "=" + entry.getValue())
                            .collect(Collectors.joining(","));
                    sb.append(paramsStr);
                    if (where != null) {
                        sb.append(" WHERE ").append(where);
                    }
                    break;
                case DELETE:
                    sb.append("DELETE FROM ");
                    break;
                default:
                    throw new IllegalArgumentException("Unknown sql type");
            }
            return sb.toString();
        }

    }


    enum SqlType {
        SELECT,
        INSERT,
        UPDATE,
        DELETE
    }
}
