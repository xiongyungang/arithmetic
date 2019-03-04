package pattern.proxy.static_proxy;

/**
 * �̳з�ʽʵ�־�̬����
 */
public class CarExtend extends Car {

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        //���ø�������ƶ�����
        super.move();
        long endTime = System.currentTimeMillis();
        //���ӹ���
        System.out.println("car:"+(endTime-startTime)+"hm");
    }

    public static void main(String arg[]) {
        CarExtend carExtend = new CarExtend();
        carExtend.move();
    }
}
