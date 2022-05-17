package 多线程;

public class m {
    public static void main(String[] args) {
        Box box = new Box();
        Conducter conducter = new Conducter(box);
        Costumer costumer = new Costumer(box);
        Thread thread1 = new Thread(conducter);
        Thread thread2 = new Thread(costumer);
        thread1.start();
        thread2.start();
    }
}
