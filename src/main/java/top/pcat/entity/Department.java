package top.pcat.entity;

import org.springframework.stereotype.Component;

@Component
public class Department {

    private Integer deptId;
    private String deptName;

    public Department() {
        System.out.println("dept创建了");
    }

    public Department(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "{ " +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                " }\n";
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
