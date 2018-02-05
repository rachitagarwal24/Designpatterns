package structural.proxy;

/**
 * Created by rachit on 5/2/18.
 */
public class ProxyPatternTest {

    public static void main(String arg[]){
        CommandExecutor executor = new CommandExecutorProxy("Rachit","");
        try{
            executor.runCommand("ls-lrt");
            executor.runCommand("rm");

        }catch (Exception e){
            System.out.println("Exception Message: "+e.getMessage());

        }


    }
}
