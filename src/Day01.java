import java.util.Scanner;

public class Day01 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 1. 生成随机7位彩票号码（范围：1000000 ~ 9999999）
        int lottery = (int) (Math.random() * 9000000 + 1000000);

        // 2. 创建Scanner对象，接收用户输入
        Scanner sc = new Scanner(System.in);
        int user;

        // 输入验证：强制用户输入7位数字
        while (true) {
            System.out.println("请输入您购买的7位彩票号码：");
            user = sc.nextInt();
            if (user >= 1000000 && user <= 9999999) {
                break;
            } else {
                System.out.println("输入错误！请输入7位数字的号码。");
            }
        }

        // 关闭Scanner
        sc.close();

        // 3. 判断是否中奖
        if (user == lottery) {
            System.out.println("恭喜您，中奖了！");
        } else {
            System.out.println("很遗憾，未中奖，本期中奖号码是：" + lottery);
        }
    }
}