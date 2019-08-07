package com.angra.aopstudy.service;

/**
 * 原接口
 */
public interface MathService {
    /**
     * 加法
     *
     * @param i
     * @param j
     * @return
     */
    int add(int i, int j);

    /**
     * 减法
     *
     * @param i
     * @param j
     * @return
     */
    int sub(int i, int j);

    /**
     * 乘法
     *
     * @param i
     * @param j
     * @return
     */
    int mul(int i, int j);

    /**
     * 除法
     *
     * @param i
     * @param j
     * @return
     */
    int div(int i, int j);
}
