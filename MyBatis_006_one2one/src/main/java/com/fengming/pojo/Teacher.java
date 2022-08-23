package com.fengming.pojo;


public class Teacher {
    private Integer tid;
    private String tname;
    private Integer age;
    private Classes classes;

    public Teacher(){}

    public Teacher(Integer tid, String tname, Integer age, Classes classes) {
        this.tid = tid;
        this.tname = tname;
        this.age = age;
        this.classes = classes;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", age=" + age +
                ", classes=" + classes +
                '}';
    }
}
