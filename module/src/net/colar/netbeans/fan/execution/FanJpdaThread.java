/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.colar.netbeans.fan.execution;

import net.colar.netbeans.fan.fantom.FanPlatform;
import net.colar.netbeans.fan.utils.FanUtilities;
import org.netbeans.api.debugger.jpda.DebuggerStartException;
import org.netbeans.api.debugger.jpda.JPDADebugger;
import org.openide.util.Exceptions;

public class FanJpdaThread extends Thread implements Runnable {

    private volatile boolean shutdown = false;
    
    private FanExecutionGroup execution;
    
    public FanJpdaThread(FanExecutionGroup execution) {
        this.execution = execution;
    }

    @Override
    public void run() {
        //wait jvm run
        while (!this.execution.isLaunchFinished()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Exceptions.printStackTrace(ex);
            }
        }
        
        FanUtilities.logger.info("Starting JPDA");
        int port = FanPlatform.debugPort();
        try {
            for (int i = 0; i != 3 && !shutdown; i++) {
                // TODO: this is kinda ugly - Use JPDASupport instead ??
                try {
                    JPDADebugger debugger = JPDADebugger.attach("localhost", port, new Object[0]);
                    // if connected, then we are good
                    return;
                } catch (DebuggerStartException e) {
                    FanUtilities.logger.fine("Failed connecting to debugger, will try again: " + e);
                    if (i == 2) {
                        FanUtilities.logger.throwing("Failed connecting to Debugger", "fan jpda", e);
                    }
                }
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void shutdown() {
        shutdown = true;
    }
}
