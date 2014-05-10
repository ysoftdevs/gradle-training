# Gradle training

Training files for learning Gradle


##01-build-and-test

Example contains one class and one simple test written in TestNG.
List all available tasks:

    gradle tasks

Try to compile source code:

    gradle compile

Run tests:

    gradle tests

Test report is available in build/reports/tests/index.html


## 02-pmd

Execute PMD check on project.

    gradle check

You should see one warning about empty if statement in source code.
Results are stored in: build/reports/pmd/main.html


## 03-checkstyle

Execute Checkstyle on project. Configuration of Checkstyle is stored in config/checkstyle/checkstyle.xml

    gradle check

Error report is available in file: build/reports/checkstyle/main.xml


## 04-findbugs

Execute FindBugs on project.

    gradle check

Report is available in file: build/reports/findbugs/main.html


## 05-jdepend

Execute JDepend on project.

    gradle check

Report is available in file: build/reports/jdepend/main.txt
You should see there one dependency cyle.


## 06-maven-deployer

Upload artifact to local repo (directory).

    gradle uA

Artifact will be stored at: /idea/training/repo


## 07-c-language

It is possible to build project written in C language by gradle.
Gradle automatically detects toolchain e.g. Visual Studio or GCC.

    gradle mainExecutable

Binary is stored in build/binaries/mainExecutable


## 08-c-visual-studio

Gradle is able to generate project files for Visual Studio for C/C++.

    gradle mainVisualStudio
    ii .\visualStudio\mainExe.sln

Solution file is stored in visualStudio/mainExe.sln


## 09-custom-task-dolast

Gradle evaluates build scripts in two phases. The first one is configuration.
Gradle examines each task definition and execute code in definition.
The second phase is execution where it actually executes code.
The code is stored in doLast block. If you omit that block then println
will execute always even when you run `gradle tasks`

    gradle tasks
    gradle helloWorld


## 10-custom-task-dofirst

doLast allows to append execution code at the end of task. There is another
method doFirst which prepends code before current code. It's useful when
building decorators.

    gradle tasks
    gradle helloWorld


## 11-task-class

Gradle allows to define custom task class. This class should contain
one method with annotation @TaskAction. This method will be executed.
Each property defined on class level is configurable from gradle task
(see verboseToday).

    gradle tasks
    gradle today
    gradle verboseToday


## 12-custom-plugin

It's possible to specify tasks outside build.gradle and then "include" file. 
Gradle uses notion of plugins. Check helloPlugin.gradle file.

    gradle tasks
    gradle helloFromPlugin


## 13-plugin-from-gist

Gradle allows to include code/plugins from network resource.
In this example plugin is stored as gist at Github
- https://gist.github.com/georgik/71663c6d8d4e01783733

    gradle tasks
    gradle helloFromGist
