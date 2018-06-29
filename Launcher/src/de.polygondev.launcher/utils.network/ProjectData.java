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
    private String iconUrl;

    /**
     * Create new project data.
     *
     * @param name project name
     * @param description project description
     * @param downloadLink download link
     * @param iconUrl url to project icon
     */
    public ProjectData(String name, String description, String downloadLink, String iconUrl) {
        this.name = name;
        this.description = description;
        this.downloadLink = downloadLink;
        this.iconUrl = iconUrl;
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
     * Get the download link.
     *
     * @return download link
     */
    public String getDownloadLink() {
        return downloadLink;
    }

    /**
     * Get the icon url.
     *
     * @return icon url
     */
    public String getIconUrl() {
        return iconUrl;
    }
}
