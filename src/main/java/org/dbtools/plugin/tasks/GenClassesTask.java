package org.dbtools.plugin.tasks;

import org.dbtools.gen.DBObjectsBuilder;
import org.dbtools.gen.android.AndroidObjectsBuilder;
import org.dbtools.gen.jpa.JPAObjectsBuilder;
import org.dbtools.plugin.extensions.DBToolsExtension;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class GenClassesTask extends DefaultTask {
    @TaskAction
    public void genclasses() {
        DBToolsExtension dbExt = (DBToolsExtension) getProject().getExtensions().findByName("dbtools");

        DBObjectsBuilder builder;
        if (dbExt.getType().equals("ANDROID")) {
            builder = new AndroidObjectsBuilder();
        } else {
            // "JPA"
            builder = new JPAObjectsBuilder();
        }

        builder.setXmlFilename(dbExt.getSchemaFullFilename());
        builder.setOutputBaseDir(dbExt.getOutputSrcDir());
        builder.setPackageBase(dbExt.getBasePackageName());

        org.dbtools.gen.GenConfig genConfig = new org.dbtools.gen.GenConfig();
        genConfig.setInjectionSupport(dbExt.isInjectionSupport());
        genConfig.setJsr305Support(dbExt.isJsr305Support());
        genConfig.setDateTimeSupport(dbExt.isDateTimeSupport());
        genConfig.setIncludeDatabaseNameInPackage(dbExt.isIncludeDatabaseNameInPackage());
        genConfig.setOttoSupport(dbExt.isOttoSupport());
        genConfig.setJavaeeSupport(dbExt.isJavaEESupport());
        genConfig.setSqlQueryBuilderSupport(dbExt.isSqlQueryBuilderSupport());

        builder.setGenConfig(genConfig);
        builder.build();
    }
}
