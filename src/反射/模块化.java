package 反射;


/*
为了使java实现轻量化 java9正式提出了模块化系统， 可以根据需要加载需要的java模块

项目
模块
包
类

模块的基本使用

需要在src下新建一个名为module-info.java的描述性文件
第一个模块
如果写下
exports 包名
第二个模块
如果写下
requires 模块名

那么
可以在第二个模块下使用第一个包的内容

声明服务接口的实现类

第一个
provides 接口名 with 类名

第二个
uses 接口名

需要使用
ServiceLoader 加载服务类

ServiceLoader<接口名> xxx = ServiceLoader.load(接口名.class)

遍历接口

for(接口名 w:xxx){
    w.接口中的方法名();
}



 */



//
public class 模块化 {
    public static void main(String[] args) {

        System.out.println("2"
        );
    }
}
