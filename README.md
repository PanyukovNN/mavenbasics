### what is the maven
Maven - is a declarative project build automation tool. 

Such build tool like ant, gradle, maven make building process simpler. It automates everyday developer goals, like code compilation, tests running, dependency import, executable file creation. 

There are two types of project build tools, declarative and imperative:
- **Ant** - imperative
- **Maven**, **Gradle** - declarative

Maven unifies the approach to project assembly, so if you understand how does one maven project work, you will know how all other projects work.

Maven approaches defined by conventions, so it allows developers to form good practices for working with a project.

Maven written on java and designed primarily to work with java projects. 
<br/>
However, there are possibilities to work with other programming languages. 

### landscape
- **pom.xml** - project object model - is a file where developer describes all project configuration details about project assembly (its name, version, dependencies and many other necessary stuff)
- **artifact** - executable jar/war/ear file
- **{user}/.m2/repository** - path to local repository
- **/target** - folder, where is stored an executable file, compiled classes, test reports etc.

