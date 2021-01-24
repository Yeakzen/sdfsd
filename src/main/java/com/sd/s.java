/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: s
 * Author:   yeak
 * Date:     2021-01-22 22:17
 * Description: sd
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sd;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br> 
 * 〈sd〉
 *
 * @author yeak
 * @create 2021-01-22
 * @since 1.0.0
 */
public class s {
    int[] df=new int[5];
    ArrayList<Integer> list=new ArrayList<Integer>();

    public static void main(String[] args) {


        int[] nums = {1,2,3,1};     //uyjl
        int[] nums1=new int[nums.length];
        int n=nums.length;
        for (int i = 0;i < n;i++){
            nums1[i] = nums[i];
        }


        Arrays.sort(nums1);
        System.out.println(nums1.toString());
        for(int i=0;i<n;i++)
        {
            if(nums[i]==nums1[n-1]) System.out.println(i);
        }



    }

}