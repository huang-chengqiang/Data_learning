package org.data.lx.digui;

import static java.lang.System.*;

/**
 * @ ClassName DiGui
 * @ Description TODO
 * @ Author faine
 * @ Date 2020/10/27
 */
public class DiGui {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,4,21,6};
            int min = Min(arr, 7);

        }
        public static int Min(int[] a, int i) {
        if (i == 0) {
            return a[0];
        }
        else {
                int min = Min(a,i-1);
                if (min > a[i]){
                    return(a[i]);
                }
                else {
                    return min;
                }
            }
        }
}
