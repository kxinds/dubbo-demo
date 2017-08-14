package cn.kxind.impl;

import cn.kxind.dao.DemoService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Company: 元年科技
 * @Author: kexin
 * @Version: V7.0
 * @Description:
 * @Date: 2017/8/11.
 */
public class DemoServiceImpl implements DemoService {

    public List<String> getPermissions(Integer id) {
        List<String> demo=new ArrayList<String>();
        demo.add(String.format("Premissios_%d",id-1));
        demo.add(String.format("Premissios_%d",id));
        demo.add(String.format("Premissios_%d",id+1));
        return demo;
    }
}
