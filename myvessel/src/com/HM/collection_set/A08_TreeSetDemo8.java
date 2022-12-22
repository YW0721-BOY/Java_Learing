package com.HM.collection_set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class A08_TreeSetDemo8 {
    /*
    * 需求：创建5个学生对象
    * 属性：（姓名、年龄、语文成绩、数学成绩、英语成绩），
    * 按照总分从高到低输出到控制台
    * 如果总分一样，按照语文成绩排
    * 如果语文一样，按照数学成绩排
    * 如果数学一样，按照英语成绩排
    * 如果英语一样，按照年龄排
    * 如果年龄一样，按照姓名字母排
    * 如果都一样，认为是同一个学生，不存在
     */
    public static void main(String[] args) {
        Student2 s1=new Student2("zhangsan",23,90,99,50);
        Student2 s2=new Student2("lisi",24,90,98,50);
        Student2 s3=new Student2("wangwu",25,95,100,30);
        Student2 s4=new Student2("zhaoliu",26,26,99,70);
        Student2 s5=new Student2("qianqi",23,70,99,70);

        TreeSet<Student2> treeSet =new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                int sum1 = o1.getChinese() + o1.getMath() + o1.getEnglish();
                int sum2 = o2.getChinese() + o2.getMath() + o2.getEnglish();
                int i = sum2 - sum1;
                i = i == 0 ? o1.getChinese() - o2.getChinese() : i;
                i = i == 0 ? o1.getMath() - o2.getMath() : i;
                i = i == 0 ? o1.getEnglish() - o2.getEnglish() : i;
                i = i == 0 ? o1.getAge() - o2.getAge() : i;
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;

                return i;

            }
        });
        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);
        treeSet.add(s5);


//        Iterator<Student2> iterator =treeSet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next()+" ");
//        }
        for (Student2 student2 : treeSet) {
            int sum=student2.getChinese()+student2.getMath()+student2.getEnglish();
            System.out.println(student2+"SUM:"+sum);
        }
    }




}
