package charpter5;

import java.util.ArrayList;

public class ArrayListPractice {
   public static void main(String args[]){

       ArrayList<Manager> managers = new ArrayList<>();

       //add
       managers.add(new Manager("ding", 20, 2018,1,23 ));
       managers.add(new Manager("zhang", 300, 2017,  2,21));

       // 指定索引插入
       managers.add(1, new Manager("yang", 200, 2017, 3,22));
       //size
       managers.size();

       //remove
       managers.remove(1);

       //确保数组列表在不重新分配存储空间的情况下就能够保存给定数量的元素
       managers.ensureCapacity(100);

       //将数组列表的存储容量削减到当前的尺寸
       managers.trimToSize();

       //替换指定索引位置的元素
       managers.set(0, new Manager("zhai", 400, 2019, 1, 20));

       //get
       managers.get(0);

   }
}
