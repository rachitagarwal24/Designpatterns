package structural.adapter;

/**
 * Created by rachit on 5/2/18.
 */
public class AdapterPatternTest {

    public static void main(String arg[]){
        System.out.println("Print volts values using classAdapter Impl");
        testClassAdapter();
        System.out.println("Print volts values using objectAdapter Impl");
        testObjectAdapter();
    }

    private static void testObjectAdapter(){
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt v1 = getVolt(socketAdapter, 1);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 =getVolt(socketAdapter, 120);

        System.out.println(v1.getVolts());
        System.out.println(v12.getVolts());
        System.out.println(v120.getVolts());
    }

    private static void testClassAdapter(){

        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v1 = getVolt(socketAdapter, 1);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println(v1.getVolts());
        System.out.println(v12.getVolts());
        System.out.println(v120.getVolts());

    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {

        switch (i){
            case 1 : return socketAdapter.get1Volt();
            case 12 : return socketAdapter.get12Volt();
            case 120 : return socketAdapter.get120Volt();
            default : return socketAdapter.get120Volt();
        }
    }


}
