package com.HM.studentsystem;

import java.util.ArrayList;

public class Until {
    public static void print(ArrayList list){
        if (list.size()!=0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }else {
            System.out.println("当前系统内无任何信息");
        }
    }
    public static int index(String id,ArrayList<Student> list){
        int index=-1;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())){
                return i;
            }
        }
        return index;
    }

    public static void add(Student s, ArrayList list){
        list.add(s);
    }

    public static void delete(String id,ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {

            if (id.equals(list.get(i).getId())){
                list.remove(i);
                System.out.println("删除成功");
                return;
            }
        }
        System.out.println("删除失败");
    }
    public static void update(Student news,ArrayList<Student> list){
        for (int i = 0; i < list.size(); i++) {
            if (news.getId().equals(list.get(i).getId())){
                list.get(i).setId(news.getId());
                list.get(i).setName(news.getName());
                list.get(i).setAge(news.getAge());
                list.get(i).setAddress(news.getAddress());

                System.out.println("更新完成");
                break;
            }
        }
        System.out.println("更新失败");
    }
}
