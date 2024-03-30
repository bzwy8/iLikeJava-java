package q;

import java.util.Scanner;

public class pop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 提示用户输入用户名
        System.out.println("请输入您的用户名：");
        String username = sc.next();

        // 提示用户输入密码
        System.out.println("请输入您的密码：");
        String password = sc.next();

        // 提示用户再次输入密码
        System.out.println("请再次输入您的密码：");
        String password2 = sc.next();

        // 验证用户名和密码
        boolean isValidUsername = username.length() >= 3;
        boolean isValidPassword = password.length() >= 6 && password.equals(password2);

        // 输出验证结果
        if (isValidUsername && isValidPassword) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
            if (!isValidUsername) {
                System.out.println("用户名长度必须至少为 3 位！");
            }
            if (!isValidPassword) {
                System.out.println("密码长度必须至少为 6 位，且两次输入的密码必须一致！");
            }
        }
    }
}
