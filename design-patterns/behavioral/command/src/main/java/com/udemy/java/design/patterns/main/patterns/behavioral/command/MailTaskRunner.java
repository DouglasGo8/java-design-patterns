package com.udemy.java.design.patterns.main.patterns.behavioral.command;

import java.util.LinkedList;
import java.util.List;

public class MailTaskRunner implements Runnable {


    private final Thread runner;
    private final List<Command> pendingCommands;
    private volatile boolean stop;
    private static final MailTaskRunner RUNNER = new MailTaskRunner();

    public static MailTaskRunner getInstance() {
        return RUNNER;
    }

    private MailTaskRunner() {

        this.pendingCommands = new LinkedList<>();

        runner = new Thread(this);
        runner.start(); // start once



    }


    @Override
    public void run() {
        while (true) {
            Command cmd = null;
            synchronized (pendingCommands) {
                if (pendingCommands.isEmpty()) {
                    try {
                        pendingCommands.wait();
                    } catch (InterruptedException ex) {
                        System.out.println("Runner interrupted");
                        if (stop) {
                            System.out.println("Runner stopping");
                            return;
                        }
                    }
                } else {
                    cmd = pendingCommands.remove(0);
                }
            }
            if (cmd == null) return;
            //
            cmd.execute();
        }
    }

    public void addCommand(Command cmd) {
        synchronized (pendingCommands) {
            pendingCommands.add(cmd);
            pendingCommands.notifyAll();
        }
    }

    public void shutdown() {
        this.stop = true;
        this.runner.interrupt();
    }


}
