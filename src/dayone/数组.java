package dayone;

/*
数组是一种一种用于存储多个相同类型数据的存储模型
格式一：int[] ar 定义了一个int类型的数组，数组名是arr
格式二：int arr[] 定义了一个int类型的变量，变量名是arr数组    两种定义结果一样 格式一好理解 推荐格式一
动态初始化 声明类型 长度 数组名arr向内存申请了地址空间
eg: int[] arr = new int  [3];
内存分配 new的动作开辟内存空间 数组初始化时会有默认值 整数默认值是0 浮点数默认值是0.0 布尔值默认值是false 字符默认值是空字符
引用数据类型默认值是null
局部变量存储局部变量 方法里的变量 arr使用完毕 立即消失
new出来的东西堆内存  实体 对象   每一个new出来的东西都有一个地址值使用完毕，会在垃圾回收器空闲时被回收
int[] arr1 = new int [n];
int[] arr2 = arr1;   结果指向的地址值相同  任意一个都可以改变该数组内容 arr1[0] = 5  和 arr2[0] = 5 效果一样 因为它们都指向同一地址
静态初始化  初始化时指定每个数组元素的初始值 由系统决定数组长度
格式：数据类型[] 变量名 = new  数据类型[]{};
eg: int[] arr = new int[]{1,2,3};
简化格式: 数据类型[] 变量名 = {数据1, 数据2, 数据3, ......}
eg int[] arr = {1, 2, 3};
常见的错误
int[] arr = {1}
索引越界 System.out.println(arr[1]);
空指针异常  arr = null; System.out.println(arr[0]);
null 空值, 引用数据类型的默认值, 表示不指向任何有效对象
 */
//
public class 数组 {
    public static void main(String[] args) {
        String a = "100";
        String b = "100";
        System.out.println(a .equals(b));
    }
}
