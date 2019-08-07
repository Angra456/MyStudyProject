package com.angra.aopstudy.service.impl;

import com.angra.aopstudy.service.MathService;

/**
 * 原方法实现类，无法生成日志，只能执行方法
 */
public class MathServiceImpl implements MathService {
    /**
     * 加法
     *
     * @param i
     * @param j
     * @return
     */
    @Override
    public int add(int i, int j) {
        int res = i + j;
        System.out.println(i + " + " + j + " = " + res);
        return res;
    }

    /**
     * 减法
     *
     * @param i
     * @param j
     * @return
     */
    @Override
    public int sub(int i, int j) {
        int res = i - j;
        System.out.println(i + " - " + j + " = " + res);
        return res;
    }

    /**
     * 乘法
     *
     * @param i
     * @param j
     * @return
     */
    @Override
    public int mul(int i, int j) {
        int res = i * j;
        System.out.println(i + " * " + j + " = " + res);
        return res;
    }

    /**
     * 除法
     *
     * @param i
     * @param j
     * @return
     */
    @Override
    public int div(int i, int j) {
        int res = i / j;
        System.out.println(i + " / " + j + " = " + res);
        return res;
    }
}
