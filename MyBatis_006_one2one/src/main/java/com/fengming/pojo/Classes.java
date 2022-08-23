package com.fengming.pojo;

public class Classes {
    private Integer cid;
    private String cname;
    private Teacher teacher;

    public Classes(){}

    public Classes(Integer cid, String cname, Teacher teacher) {
        this.cid = cid;
        this.cname = cname;
        this.teacher = teacher;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
