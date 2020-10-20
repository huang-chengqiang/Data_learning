package org.data.lx;

import com.sun.org.apache.bcel.internal.generic.PUTSTATIC;

/**
 * @ClassName sub_strl
 * @Description TODO
 * @Author faine
 * @Date 2020/10/13
 */
class sub_str{
    public static void main(String[] args){
        String str = "abbc";
        System.out.println(str);

        System.out.println("-------------");
        for(int i = 0; i < str.length(); i++){
            for (int j = i+1; j<=str.length(); j++){
                System.out.println(str.substring(i,j));

            }
        }
    }
}