package com.example.second.entity;

public class Teacher {
    private Long uid;

    private String name;

    private Integer age;

    private String sex;

    private String subject;

    private Integer salary;

    private String native_place;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) { this.sex = sex == null ? null : sex.trim(); }

    public String getSubject() { return subject; }

    public void setSubject(String subject) { this.subject = subject; }

    public Integer getSalary() { return salary; }

    public void setSalary(Integer salary) { this.salary = salary; }

    public String getNative_place() { return native_place; }

    public void setNative_place(String native_place) { this.native_place = native_place; }
}
