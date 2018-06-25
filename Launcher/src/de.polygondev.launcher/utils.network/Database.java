package de.polygondev.launcher.utils.network;

import java.util.List;

/**
 * This interface represents a general database and is used as general strategy.
 *
 * @author Paul2708
 */
public interface Database {

    /**
     * Connect to the database.
     */
    void connect();

    /**
     * Set up the database.
     */
    void setUp();

    /**
     * Resolve all projects.
     *
     * @return list of project data
     */
    List<ProjectData> resolveProjects();
}
