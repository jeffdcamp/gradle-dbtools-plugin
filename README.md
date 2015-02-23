Gradle DBTools Plugin
=====================

Gradle DBTools Plugin


Setup
-----

    buildscript {
        repositories {
            mavenCentral()
        }
        dependencies {
            classpath 'org.dbtools:gradle-dbtools-plugin:<latest-version>'
        }
    }

    apply plugin: 'dbtools'

    dependencies {
        compile 'org.dbtools:dbtools-android:<latest dbtools-android version>'
        compile 'org.dbtools:dbtools-query:<latest dbtools-query version>' // optional
    }

    dbtools {
        type 'ANDROID'

        basePackageName 'org.company.project.domain'
        outputSrcDir 'src/main/java/org/company/project/domain'

        injectionSupport true
        jsr305Support true
        includeDatabaseNameInPackage true
        ottoSupport true
        dateTimeSupport true
    }

Usage
-----

    * Create initial DBTools files

    ./gradlew dbtools-init


    * Generate DBTools domain objects

    ./gradlew dbtools-genclasses


License
-------

    Copyright 2015 Jeff Campbell

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
