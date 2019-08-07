package com.angra.aopstudy;

import com.angra.aopstudy.service.impl.MathServiceImpl;
import com.angra.aopstudy.service.MathService;

public class Main {
    public static void main(String[] args) {
        // 获取原生对象
        MathService mathService = new MathServiceImpl();
        // 不会输出日志
        mathService.add(1, 2);
        System.out.println();
        mathService.sub(9, 3);
        System.out.println();
        mathService.mul(3, 6);
        System.out.println();
        mathService.div(8, 2);
        System.out.println();
        System.out.println("-------------------------华丽的分割线-------------------------");
        System.out.println();
        // 获取可生成日志的MathService对象
        MathService logService = new MathServiceLogger(mathService).getLoggerService();
        // 会输出日志
        logService.add(1, 2);
        System.out.println();
        logService.sub(9, 3);
        System.out.println();
        logService.mul(3, 6);
        System.out.println();
        logService.div(8, 2);
    }
}
