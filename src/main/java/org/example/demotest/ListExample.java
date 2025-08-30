package org.example.demotest;

import org.example.demotest.entity.student;
import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class ListExample {

    public static void main(String[] args) {
        System.out.println("-------------ArrayList");
        /**
         * ArrayList
         * ArrayList支持可随需要而进行动态增长的动态数组。其内部存储数据结构数组。
         * ArrayList可以快速索引元素，查找较快。插入、删除较慢。
         */
        ArrayList<Persion> mList = new ArrayList<Persion>();
        Persion pa1 = new Persion("孔乙己",40);
        Persion pa2 = new Persion("小D",42);
        mList.add(pa1);
        mList.add(pa2);
        mList.add(pa1);
        mList.add(pa1);
        mList.add(pa1);
        mList.add(pa1);
        System.out.println("Persion count is:"+mList.size());
        for(Persion p:mList){
            System.out.println("Persion is:"+p);
        }
        System.out.println("-------------LinkedList");
        /**
         * LinkedList
         * 通过连接指针来关联前后两个元素，使用双向链表。
         * 插入和删除较快，适合实现栈和队列
         */
        LinkedList<Persion> linkPersion = new LinkedList<Persion>();
        Persion pb1 = new Persion("二胡",40);
        Persion pb2 = new Persion("小四",42);
        linkPersion.add(pb1);
        linkPersion.add(pb2);
        for(Persion p:linkPersion){
            System.out.println("Persion is:"+p);
        }
        System.out.println("-------------Vector");
        /**
         * Vector
         * 矢量
         * 线程安全的
         */
        Vector<Persion> vectory = new Vector<Persion>();
        Persion pc1 = new Persion("赵四爷",40);
        Persion pc2 = new Persion("小二",23);
        vectory.add(pc1);
        vectory.add(pc2);
        for(Persion p:vectory){
            System.out.println("Persion is:"+p);
        }

    }
}
class Persion{
    public String mName;
    public int mAge;
    public static AtomicInteger sIndex = new AtomicInteger();
    public int mIndex;
    public Persion(String name,int age){
        mName = name;
        mAge = age;
        mIndex = sIndex.addAndGet(1);
    }
    @Override
    public String toString() {
        return "Persion name is:"+mName+",年龄："+mAge+",这是第："+mIndex+",个对象。"+super.toString();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Persion){
            Persion other = (Persion) obj;
            return mName.equals(other.mName)&&mAge == other.mAge;
        }
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
