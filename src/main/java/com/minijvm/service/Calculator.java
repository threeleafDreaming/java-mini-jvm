package com.minijvm.service;

/**
 * <p>Title: Calculator</p>
 * <p>Company:无 </p>
 * <p>Description:
 * 描述：
 * </p>
 *
 * @Version 1.0.0
 * @Author Jimmy.Shen
 * @since 2020-06-01 10:27
 **/
public interface Calculator {

    /**
     * <p>Description:
     * 描述：加法
     * </p>
     * @author: Jimmy.shen
     * @date: 2020/6/1/001 19:23
     */
    int add(int a,int b);
    /**
     * <p>Description:
     * 描述：减法
     * </p>
     * @author: Jimmy.shen
     * @date: 2020/6/1/001 19:23
     */
    int subtract(int a,int b);
    /**
     * <p>Description:
     * 描述：乘法
     * </p>
     * @author: Jimmy.shen
     * @date: 2020/6/1/001 19:23
     */
    int multiply(int a,int b);
    /**
     * <p>Description:
     * 描述：除法
     * </p>
     * @author: Jimmy.shen
     * @date: 2020/6/1/001 19:23
     */
    int divide(int a,int b);

}
