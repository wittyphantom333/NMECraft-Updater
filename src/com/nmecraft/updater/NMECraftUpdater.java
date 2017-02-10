/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmecraft.updater;

/**
 *
 * @author adamwitt
 */
public class NMECraftUpdater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
        
        // the application menu for Mac OS X must be set very early in the cycle
    String opSysName = System.getProperty("os.name").toLowerCase();
    if (opSysName.contains("mac")) {
        // to set the name of the app in the Mac App menu:
        System.setProperty("apple.awt.application.name", "NMECraft Updater");
        //to show the menu bar at the top of the screen:
        System.setProperty("apple.laf.useScreenMenuBar", "true");
        // to show a more mac-like file dialog box
        System.setProperty("apple.awt.fileDialogForDirectories", "true");
        //underlying laf:
        javax.swing.UIManager.getInstalledLookAndFeels();

        // other set-up code goes here
    }
    else {  // not on Mac OS X
        // set-up code for non-Mac systems
    }
    
    
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NMECraftUpdaterUI().setVisible(true);
                
            }
        });
    }
    
    
}
