package structural.proxy;

/**
 * Created by rachit on 5/2/18.
 */
public class CommandExecutorImpl implements CommandExecutor {


    @Override
    public void runCommand(String cmd) throws Exception {

        Runtime.getRuntime().exec(cmd);
        System.out.println("Command Executed "+cmd);

    }
}
