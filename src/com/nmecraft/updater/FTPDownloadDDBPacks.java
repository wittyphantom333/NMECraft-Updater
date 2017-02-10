/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nmecraft.updater;

import java.io.IOException;
 
import org.apache.commons.net.ftp.FTPClient;
 
public class FTPDownloadDDBPacks {
 
    public static void main(String[] args) {
        String server = "mc.nmecraft.com";
        int port = 21;
        String user = "minecraft";
        String pass = "minecraft";
 
        FTPClient ftpClient = new FTPClient();
 
        try {
            // connect and login to the server
            ftpClient.connect(server, port);
            ftpClient.login(user, pass);
 
            // use local passive mode to pass firewall
            ftpClient.enterLocalPassiveMode();
 
            System.out.println("Connected");
 
            String remoteDirPath = "/ddbpacks/";
            String saveDirPath = "/Users/adamwitt/FTP/";
 
            FTPUtil.downloadDirectory(ftpClient, remoteDirPath, "", saveDirPath);
 
            // log out and disconnect from the server
            ftpClient.logout();
            ftpClient.disconnect();
 
            System.out.println("Disconnected");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}