package org.jabref.logic.openoffice;

import java.util.Arrays;
import java.util.List;

public class OpenOfficePreferences {

    public static final String DEFAULT_WINDOWS_PATH = "C:\\Program Files\\LibreOffice 5";
    public static final String DEFAULT_WIN_EXEC_PATH = "C:\\Program Files\\LibreOffice 5\\program";
    public static final String WINDOWS_EXECUTABLE = "soffice.exe";

    public static final String DEFAULT_OSX_PATH = "/Applications/OpenOffice.org.app";
    public static final String DEFAULT_OSX_EXEC_PATH = "/Applications/OpenOffice.org.app/Contents/MacOS/soffice";
    public static final String OSX_EXECUTABLE = "soffice";

    public static final String DEFAULT_LINUX_PATH = "/usr/lib/libreoffice";
    public static final String DEFAULT_LINUX_EXEC_PATH = "/usr/lib/libreoffice/program/soffice";
    public static final String LINUX_EXECUTABLE = "soffice";

    public static final List<String> OO_JARS = Arrays.asList("unoil.jar", "jurt.jar", "juh.jar", "ridl.jar");

    private String executablePath;
    private String installationPath;
    private Boolean useAllDatabases;
    private Boolean syncWhenCiting;
    private Boolean showPanel;
    private List<String> externalStyles;
    private String currentStyle;
    private String jarsPath;

    public OpenOfficePreferences(//testado 
            String jarsPath,
            String executablePath,
            String installationPath,
            Boolean useAllDatabases,
            Boolean syncWhenCiting,
            Boolean showPanel,
            List<String> externalStyles,
            String currentStyle
    ) {
        this.jarsPath = jarsPath;
        this.executablePath = executablePath;
        this.installationPath = installationPath;
        this.useAllDatabases = useAllDatabases;
        this.syncWhenCiting = syncWhenCiting;
        this.showPanel = showPanel;
        this.externalStyles = externalStyles;
        this.currentStyle = currentStyle;
    }

    public void clearCurrentStyle() {//testado
        this.currentStyle = null;
        // TODO: sync to prefs
    }

    /**
     * path to soffice-file
     */
    public String getExecutablePath() {//testado 
        return executablePath;
    }

    public void setExecutablePath(String executablePath) {//testado
        this.executablePath = executablePath;
    }

    /**
     * main directory for OO/LO installation, used to detect location on Win/OS X when using manual connect
     */
    public String getInstallationPath() {//testado 
        return installationPath;
    }

    public void setInstallationPath(String installationPath) {//testado
        this.installationPath = installationPath;
    }

    /**
     * true if all databases should be used when citing
     */
    public Boolean getUseAllDatabases() {//testado
        return useAllDatabases;
    }

    public void setUseAllDatabases(Boolean useAllDatabases) {//testado
        this.useAllDatabases = useAllDatabases;
    }

    /**
     * true if the reference list is updated when adding a new citation
     */
    public Boolean getSyncWhenCiting() {//testado 
        return syncWhenCiting;
    }

    public void setSyncWhenCiting(Boolean syncWhenCiting) {//testado 
        this.syncWhenCiting = syncWhenCiting;
    }

    /**
     * true if the OO panel is shown on startup
     */
    public Boolean getShowPanel() {//testado 
        return showPanel;
    }

    public void setShowPanel(Boolean showPanel) {//testado
        this.showPanel = showPanel;
    }

    /**
     * list with paths to external style files
     */
    public List<String> getExternalStyles() {//testado
        return externalStyles;
    }

    public void setExternalStyles(List<String> externalStyles) {//testado 
        this.externalStyles = externalStyles;
    }

    /**
     * path to the used style file
     */
    public String getCurrentStyle() { //testado 
        return currentStyle;
    }

    public void setCurrentStyle(String currentStyle) {
        this.currentStyle = currentStyle;
    }

    /**
     * directory that contains juh.jar, jurt.jar, ridl.jar, unoil.jar
     */
    public String getJarsPath() {//testado 
        return jarsPath;
    }

    public void setJarsPath(String jarsPath) {//testado 
        this.jarsPath = jarsPath;
    }

    public void updateConnectionParams(String ooPath, String execPath, String jarsPath) {//testado
        setInstallationPath(ooPath);
        setExecutablePath(execPath);
        setJarsPath(jarsPath);
    }

    public void clearConnectionSettings() {//testado
        this.installationPath = null;
        this.executablePath = null;
        this.jarsPath = null;
    }

}
