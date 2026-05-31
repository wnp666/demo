import java.util.Scanner;

public class OperatorDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        try {
            int a = sc.nextInt();
            // 先判断是否是三位数
            if (a >= 100 && a <= 999) {
                boolean isDivisibleBy3 = (a % 3 == 0);
                if (isDivisibleBy3) {
                    System.out.println(a + " 能被3整除");
                } else {
                    System.out.println(a + " 不能被3整除");
                }
            } else {
                System.out.println("输入的不是三位数，请重新运行程序并输入三位数！");
            }
        } catch (Exception e) {
            System.out.println("输入无效，请输入一个整数！");
        } finally {
            sc.close(); // 关闭Scanner，释放资源
        }
    }
}