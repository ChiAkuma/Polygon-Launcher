package de.polygondev.launcher.main;

import de.polygondev.launcher.utils.network.Database;
import de.polygondev.launcher.utils.network.MysqlInterface;

public class Init {

    public static void main(String[] args) {
        Database database = new MysqlInterface();

        database.connect();
        database.setUp();

        // TODO: Show-up gui
    }
    
}