package api.thread.ex01;

public class ThreadTest implements Runnable /*extends Thread*/ {

    private int num = 0;

    //쓰레드가 run메서드를 동작시킴
    @Override
    public synchronized void run() {

        for(int i = 0; i < 10; i++) {
            //쓰레드 관련 기능을 사용할 때는 Thread.static메서드
            //현재 동작하는 쓰레드 이름이 A
            if( Thread.currentThread().getName().equals("A") ) {
                num++;
            }

            System.out.println( Thread.currentThread().getName() + ":" + num );

            try {
                Thread.sleep(1000); //1초간 일시정지
            } catch (Exception e) {}


        }

    }
}
