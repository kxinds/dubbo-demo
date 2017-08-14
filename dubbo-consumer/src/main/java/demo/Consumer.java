package demo;

import cn.kxind.dao.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Company: 元年科技
 * @Author: kexin
 * @Version: V7.0
 * @Description:
 * @Date: 2017/8/14.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext_consumer.xml");
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService"); // 获取远程服务代理
        List<String> s= demoService.getPermissions(3000); // 执行远程方法
        System.out.println( s.toString() ); // 显示调用结果
    }
}
