package de.polygondev.launcher.utils.network;

/**
 * This class holds information of a project.
 *
 * @author Paul2708
 */
public class ProjectData {

    private String name;
    private String description;
    private String downloadLink;

    /**
     * Create new project data.
     *
     * @param name
     * @param description
     * @param downloadLink
     */
    public ProjectData(String name, String description, String downloadLink) {
        this.name = name;
        this.description = description;
        this.downloadLink = downloadLink;
    }

    /**
     * Get the name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the description.
     *
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the download link
     *
     * @return download link
     */
    public String getDownloadLink() {
        return downloadLink;
    }
}
