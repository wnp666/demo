package com.itheima.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
             /*
        我方：叉子                对方：长手
        攻击：220                 攻击：210
        防御：85                  防御：80
        血量：1012.5              血量：1223.3
        技能加成： 1.2            技能加成：1.3

        技能造成伤害的公式：攻击力 * 技能加成 - 对方防御力
        普攻造成伤害的公式：攻击力 - 对方防御力

        计算：
        我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
        我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
        规则：经常变的数据采用变量记录
        */
//        定义一个变量记录我方的攻击力
        double myAttack = 220;
        //        定义一个变量记录我方的防御力
        double myDefense = 85;
        //        定义一个变量记录我方的血量
        double myHealth = 1012.5;
        //        定义一个变量记录我方的技能加成
        double mySkillAdd = 1.2;
        //        定义一个变量记录对方的攻击力
        double enemyAttack = 210;
        //        定义一个变量记录对方的防御力
        double enemyDefense = 80;
        //        定义一个变量记录对方的血量
        double enemyHealth = 1223.3;
        //        定义一个变量记录对方的技能加成
        double enemySkillAdd = 1.3;

        //我方第一次进行普通攻击，造成多少伤害，对方还剩余多少血量？
        // 普攻造成伤害的公式：攻击力 - 对方防御力
        double myNormalDamage = myAttack - enemyDefense;
        enemyHealth=enemyHealth-myNormalDamage;
        System.out.println(enemyHealth);

        //我方第二次进行技能攻击，造成多少伤害，对方还剩余多少血量？
        // 技能造成伤害的公式：攻击力 * 技能加成 - 对方防御力
        double mySkillDamage = myAttack * mySkillAdd - enemyDefense;
        enemyHealth=enemyHealth-mySkillDamage;
        System.out.println(enemyHealth);
    }
}
