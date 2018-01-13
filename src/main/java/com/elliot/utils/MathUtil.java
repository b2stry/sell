package com.elliot.utils;

public class MathUtil {
    private static final Double Moery_Range = 0.01;

    /**
     * 比较2个金额是否相等
     *
     * @param d1
     * @param d2
     * @return
     */
    public static Boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        if (result < Moery_Range) {
            return true;
        } else {
            return false;
        }
    }
}
