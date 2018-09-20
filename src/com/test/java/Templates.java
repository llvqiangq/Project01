package com.test.java;

import java.util.ArrayList;

/**
 * @create 2018-09-20 18:34
 * 1.IDEA中代码模板所处的位置：settings-Editor-live Templates/Postfix Completions
 * 2.常用的模板
 */
public class Templates {
    //模板六：prsf
    private static final Customer cust=new Customer();
    //变形：psf
    public static final int NUM=10;
    //变形：psfi
    public static final int NUM1=19;
    //变形：psfs
    public static final String NATION="China";
    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello!!");
        //变形soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("Templates.main");
        int num1=10;
        System.out.println("num1 = " + num1);

        //模板三：fori
        String[] arr=new String[]{"Tom","Mary"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
            
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);
        for (Object o : list) {
            System.out.println(o);
        }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        //模版五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }

    }
}
