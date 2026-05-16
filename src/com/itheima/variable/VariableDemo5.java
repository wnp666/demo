package com.itheima.variable;

public class VariableDemo5 {

    public static void main(String[] args) {
        //定义变量记录我的体重58
        double myWeight = 58;
        //定义我的身高1.63
        double myHeight = 1.63;
        //计算我的BMI值
        double bmi = myWeight / myHeight / myHeight;
        System.out.println(bmi);


        //BMI的计算公式是：
        //BMI = 体重(kg) / 身高(m)²
        //
        //代码中做了反向推导：
        //最大体重 = 最大BMI值 × 身高(m) × 身高(m)
        //
        //3. 代码解读
        //25：这是一个经验上限值（接近超重临界值24），表示"健康体重的最高参考值"
        //myHeight：身高，单位是米（如1.63m）



        //计算出当前身高，在标准mbi中最重的体重
        double maxWeight = 25 * myHeight * myHeight;
        System.out.println(maxWeight);
    }
}
