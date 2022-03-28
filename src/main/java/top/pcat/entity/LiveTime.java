package top.pcat.entity;

public class LiveTime {

    private Integer id;

    public LiveTime(){
        System.out.println("第一步：调用无参构造函数进行实例化");
    }

    public void setId(Integer id){
        this.id = id;
        System.out.println("第二步：调用set方法进行属性赋值");

    }

    public void initMethod() {
        System.out.println("第三步：调用初始化方法");
    }
    public void test() {
        System.out.println("第四步：使用bean");
    }
    public void destoryMethod() {
        System.out.println("第五步：调用销毁方法");
    }

}
