/**
 * @author lei_lei
 * @version 1.0
 */
package Thread类型;

public class Four {
    public static void main(String[] args) {
        new Thread(() -> System.out.println()).start();
        new daili(new my()).hap();
      
    }

}

interface  Marry{
    void hap();
}

class my implements Marry {
    @Override
    public void hap() {
        System.out.println("happy");
    }
}

class daili implements Marry {
    private Marry target;
    
    public daili(Marry target) {
        this.target = target;
    }
    
    @Override
    public void hap() {
        //代理角色
        before();
        this.target.hap();
        after();
    }
    
    private void after() {
        System.out.println("marry后");
    }
    
    private void before() {
        System.out.println("marry前");
    }
}
