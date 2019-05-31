package com.unicom.gitgithub.controller;

import com.unicom.gitgithub.entity.News;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName：NewController
 * @Author：kuangzy
 * @Time：2019/5/31 9:04
 * @Discription:discription
 */
@RestController
@RequestMapping("news")
public class NewController {
    @RequestMapping("getAll")
    public List<News> getAll(){
        News news1 = new News(1,"aaa","cc");
        News news2 = new News(2,"bbb","cccc");
        News news3 = new News(3,"ddd","ccc");
        List<News> list = new ArrayList<>();
        list.add(news1);
        list.add(news2);
        list.add(news3);
        return list;
    }
}
