package com.mch.stream;

import java.util.*;
import java.util.stream.Stream;

public class ObtainStream {
    public static void main(String[] args) {
        /**
         * 获取流
         * */
        //list
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("张思");
        list.add("张四");
        list.add("里斯");
        /**
         * 一个流只能使用一次，否则会报错
         *
         * java.lang.IllegalStateException: stream has already been operated upon or closed
         * */
        Stream<String> streamList = list.stream();
        streamList.filter((name)->{
            return name.startsWith("张");
        }).filter((name)->{
            return name.endsWith("思");
        }).forEach((name)-> System.out.println(name));

        Stream<String> streamList1 = list.stream();
        System.out.println(streamList1.count());


        //map
        Map<String,String> map = new HashMap<>();
        //键
        Set<String> keyMap = map.keySet();
        Stream<String> streamKeyMap = keyMap.stream();
        //值
        Collection<String> valuesMap = map.values();
        Stream<String> streamValueMap = valuesMap.stream();

        //数组
        int arr[] = {1,2,3,4,5,4,5,3};
        Stream<int[]> streamArr = Stream.of(arr);

        Stream<int[]> distinct = streamArr.distinct();
        distinct.forEach((num)->{
            System.out.println(num.length);
            System.out.println(num[0]);
        });

    }
}
