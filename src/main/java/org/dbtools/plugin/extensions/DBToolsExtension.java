package org.dbtools.plugin.extensions;

public class DBToolsExtension extends BaseDBToolsExtension {
    /**
     * Based directory where the source files will be generated.
     */
    private String outputSrcDir;

    /**
     * Type of application: JPA, ANDROID
     */
    private String type = "JPA";

    /**
     * Add JEE/Spring Transactional annotations to CRUD methods in BaseManager
     */
    private boolean javaEESupport = false;

    /**
     * Use JSR 310 DateTime (using Joda)
     */
    private boolean dateTimeSupport = false;

    /**
     * Use CDI Dependency Injection
     */
    private boolean injectionSupport = false;

    /**
     * Use Otto Event Bus to subscribe to database changes
     */
    private boolean ottoSupport = false;

    /**
     * Use jsr 305 (@Nullable, @Notnull, etc)
     */
    private boolean jsr305Support = true;

    /**
     * If using multiple databases, it may be better to organize domain objects by database name
     */
    private boolean includeDatabaseNameInPackage = false;

    /**
     * Name of the base package that should be used for generated files.  This
     * package name is a base to the packages that will be generated
     * (example: com.company.data will produce the following com.company.data.object1,
     * com.company.data.object2, etc) This package is also used to determine the
     * directories to create in both the
     * src/main/java AND src/test/java directories
     */
    private String basePackageName;

    public String getOutputSrcDir() {
        return outputSrcDir;
    }

    public void outputSrcDir(String outputSrcDir) {
        this.outputSrcDir = outputSrcDir;
    }

    public String getType() {
        return type;
    }

    public void type(String type) {
        this.type = type;
    }

    public boolean isJavaEESupport() {
        return javaEESupport;
    }

    public void javaEESupport(boolean javaEESupport) {
        this.javaEESupport = javaEESupport;
    }

    public boolean isDateTimeSupport() {
        return dateTimeSupport;
    }

    public void dateTimeSupport(boolean dateTimeSupport) {
        this.dateTimeSupport = dateTimeSupport;
    }

    public boolean isInjectionSupport() {
        return injectionSupport;
    }

    public void injectionSupport(boolean injectionSupport) {
        this.injectionSupport = injectionSupport;
    }

    public boolean isOttoSupport() {
        return ottoSupport;
    }

    public void ottoSupport(boolean ottoSupport) {
        this.ottoSupport = ottoSupport;
    }

    public boolean isIncludeDatabaseNameInPackage() {
        return includeDatabaseNameInPackage;
    }

    public void includeDatabaseNameInPackage(boolean includeDatabaseNameInPackage) {
        this.includeDatabaseNameInPackage = includeDatabaseNameInPackage;
    }

    public String getBasePackageName() {
        return basePackageName;
    }

    public void basePackageName(String basePackageName) {
        this.basePackageName = basePackageName;
    }

    public boolean isJsr305Support() {
        return jsr305Support;
    }

    public void jsr305Support(boolean jsr305Support) {
        this.jsr305Support = jsr305Support;
    }
}
