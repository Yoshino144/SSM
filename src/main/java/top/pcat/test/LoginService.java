package top.pcat.test;

public class LoginService implements BaseService{

    public boolean login(String username, String password) {
        System.out.println("参数校验");
        if (username == null || "".equals(username) || password == null || "".equals(password)) {
            System.out.println("校验未通过，重新登陆");
            return false;
        } else {
            //2.校验用户和密码
            System.out.println("检验用户和密码");
            if (password.contains("8")) {
                return true;

//                if (username.contains("E")){
//                    return true;
//                }else{
//                    System.out.println("权限校验失败");
//                    return false;
//                }

            } else {
                System.out.println("用户民和喵喵未通过");
                return false;
            }
        }


    }

}
