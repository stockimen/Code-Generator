package com.im;

import com.im.cli.CommandExecutor;

public class Main {
    public static void main(String[] args) {
//        args = new String[]{"generate", "-a","-l","-o"};
//        args = new String[]{"generate", "-a"};
//        args = new String[]{"config"};
//        args = new String[]{"list"};
        args = new String[]{"generate"};

        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}
