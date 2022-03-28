package top.pcat.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component(value = "zs")
public class Employee {

    private Integer id;
    private String empName;
    private Integer age;
    private Integer sex;
    private String email;
    private Date birth;

    @Autowired
    private Department dept;
    private Integer did;
    private String img = "default.jpg";

    public Employee() {
        System.out.println("emp创建了");
    }

    public Employee(Integer id, String empName, Integer age, Integer sex, String email, Date birth, Department dept, Integer did, String img) {
        this.id = id;
        this.empName = empName;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.birth = birth;
        this.dept = dept;
        this.did = did;
        this.img = img;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
