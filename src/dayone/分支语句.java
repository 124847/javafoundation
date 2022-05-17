package dayone;
/*
顺序结构 从上到下依次执行
三种 if结构
一，
if(){
}
二，
if(){
}
else{
}
三，
if(){
}
else if(){
}
else if(){
}
else{
}
switch语句格式
switch(表达式){
case 值1:                    这里的值就是和表达式做匹配如果相同就执行该case下的语句
       语句体;
       break;
case 值2:
        语句体:
        break;
......
default:
        语句体:
        break;
}
循环结构
for(初始化语句;条件判断语句;条件控制语句){
      循环体语句;
}
首先初始化 然后条件判断 然后循环体 最后条件控制
水仙花数重点： 任意数字的指定位上的的数值如何求
             先用整除操作将要求的数字移动到个位上，再使用取余操作取出最后一位上的值
             Math.pow(底数, 幂)
初始化语句
while(条件判断语句){
    循环体语句;
    条件控制语句;
}
首先初始化 然后条件判断 然后循环体 最后条件控制   和 for循环顺序一样
初始化语句;
do{
    循环体语句;
    条件控制语句;
}while(条件判断语句)
首先初始化 循环体语句 条件控制语句 条件判断语句
死循环
for(;;){
}
while(true){
}
do{
}while(true)

跳转控制语句
continue 用在循环中,基于条件控制,跳过某次循环体内容的执行,继续下一次的执行
break 用在循环中,基于条件控制,终止循环体内容的执行，也就是说结束当前整个循环
return
Random
导包 import java.util.Random;
创建对象 Random r = new Random();
获得随机数 int number = r.nextInt(10) 获得的数据范围[0,10) 包括0不包括10;
 */
//{}

import java.util.Scanner;
import java.util.Random;

public class 分支语句 {
    public static void main(String[] args) {
        Random r = new Random();
        int count = 0;
        int x;
        do {
            x = r.nextInt(10) + 1;
            count++;
            System.out.println(x);
        }
        while (x != 10);
        System.out.println(count);
    }
}

