package cn.kxind;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Company: 元年科技
 * @Author: kexin
 * @Version: V7.0
 * @Description:
 * @Date: 2017/8/11.
 */
public class applicationContext {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();//任意键退出
    }
}
