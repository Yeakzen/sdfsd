/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: debug
 * Author:   yeak
 * Date:     2021-01-23 01:20
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sd;

import java.util.HashMap;

/**
 * 〈〉
 *
 * @author yeak
 * @create 2021-01-23
 */
public class debug {
    public static void main(String[] args){

        for (int i = 0; i < 100; i++) {
            System.out.println(i);        }


        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","Tsinghua");
        map.put("major","computer");

        String age = map.get("age");
        System.out.println("age = " + age);

        map.remove("major");
        System.out.println(map);

    }
}