package de.polygondev.launcher.utils.network;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * This database is a mysql database.
 *
 * @author Paul2708
 */
public class MysqlInterface implements Database {

    // TODO: Change ip
    private static final String HOST = "127.0.0.1";

    private static final int PORT = 3306;

    private static final String USER = "polygondev_launcher";

    private static final String PASSWORD = "FUQ8Fn27bcFVCNpr";

    private static final String DATABASE = "polygondev_data";

    private static final String TABLE = "Projects";

    private Connection connection;

    /**
     * Connect to the database.
     */
    @Override
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            this.connection = DriverManager.getConnection("jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE + "?user="
                            + USER + "&password=" + PASSWORD + "&autoReconnect=true");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Set up the database.
     */
    @Override
    public void setUp() {
        // Nothing to do here..
    }

    /**
     * Resolve all projects.
     *
     * @return list of project data
     */
    @Override
    public List<ProjectData> resolveProjects() {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM `" + TABLE + "`");

            ResultSet resultSet = statement.executeQuery();

            List<ProjectData> projects = new LinkedList<>();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String iconUrl = resultSet.getString("IconUrl");
                String downloadPath = resultSet.getString("DownloadPath");
                String description = resultSet.getString("Description");

                ProjectData data = new ProjectData(name, description, downloadPath, iconUrl);
                projects.add(data);
            }

            return projects;
        } catch (SQLException e) {
            e.printStackTrace();

            return new LinkedList<>();
        }
    }
}
