package de.polygondev.launcher.main;

import de.polygondev.launcher.utils.network.Database;
import de.polygondev.launcher.utils.network.MysqlInterface;
import de.polygondev.launcher.utils.network.ProjectData;
import java.util.List;

public class Init {

    public static void main(String[] args) {
        Database database = new MysqlInterface();

        database.connect();
        database.setUp();

        List<ProjectData> projects = database.resolveProjects();

        // TODO: Show-up gui and add projects list to view
    }
    
}