package cn.marsma.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.marsma.ssm.po.Items;

public class ItemsController1 implements Controller{

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        List<Items> list = new ArrayList<Items>();

        Items items1 = new Items();
        items1.setName("联想笔记本");
        items1.setPrice(6000f);
        items1.setDetail("ThinkPad T430联想笔记本电脑");

        Items items2 = new Items();
        items2.setName("苹果手机");
        items2.setPrice(5000f);
        items2.setDetail("iphone6苹果手机");

        list.add(items1);
        list.add(items2);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", list);
        modelAndView.setViewName("product");
        return modelAndView;
    }

}
