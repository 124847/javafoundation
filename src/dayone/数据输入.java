package dayone;

/*
Scanner 使用基本步骤
导包
import java.util.Scanner;
创建一个对象sc 可以任意取名字 eg:a b c d
Scanner sc = new Scanner (System.in);
接受数据 这里的sc 和上面创建的对象名称保持一致
int i = sc.nextInt();
 */
/**/
import java.util.Scanner;

public class 数据输入 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println(i);
    }
}
