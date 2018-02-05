package structural.proxy;

/**
 * Created by rachit on 5/2/18.
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String pass) {
        if("Rachit".equals(user)&&"Agarwal".equals(pass))
            isAdmin=true;

        commandExecutor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {

        if(isAdmin)
            commandExecutor.runCommand(cmd);
        else
            if(cmd.trim().startsWith("rm")) {
                throw new Exception("rm command is not allowed");
            } else {
                commandExecutor.runCommand(cmd);
            }

    }
}
