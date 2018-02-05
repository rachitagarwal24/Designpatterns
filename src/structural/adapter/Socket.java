package structural.adapter;

/**
 * Created by rachit on 5/2/18.
 */
public class Socket {

    public Volt getVolt() {
        return new Volt(120);
    }
}
