### maven lifecycles
The maven lifecycle - it is a phase sequence. It means that lifecycle consists of phases that are executed one after another sequentially.

There are only three lifecycles in the maven: 
- **`site`** - creates a website with information about a project
- **`clean`** - removes *target* directory
- **`default`** - the default lifecycle consists of more than 20 phases

Note, that you can run several lifecycles in one command: 
<br/>
`mvn clean package`

### default lifecycle, phases
Phase - is a step of lifecycle. Phase may consists of zero or more goals.

Most important phases of default lifecycle:
- **`compile`** - compile source code of a project
- **`test-compile`** - compile source code of tests
- **`test`** - runs tests
- **`package`** - packs compiled project files into executable jar/war/ear file
- **`install`** - put an executable file to local repository, from where it can be imported by local projects
- **`deploy`** - copy an executable file to the remote repository for sharing with other developers.

These phases are consecutive. When you run the `package` phase, such phases like `compile`, `test-compile` and `test` will be executed in advance.

Note, that you can skip some phases.
<br/> 
For instance, to skip test phase you need to specify this property:
<br/>
`mvn -Dmaven.test.skip=true package`

### goals
Goal - is a unit of work. In most cases goals linked to phases. 
Every goal is running with specified plugin. 
<br/>
For instance, the *compiler* plugin runs goals *compile* and *test compile*.

It is possible to run goals separately from the lifecycle and phases.
<br/> 
`mvn compiler:compile`

The result of this command would be the execution of the *compile* goal, not any another goal would be run.

Examples of goals:
- **`resources:resources`**
- **`compiler:compile`**
- **`resources:testRespurces`**
- **`compiler:testCompile`**
- **`surefire:test`**
- **`jar:jar`**
- **`install:install`**
- **`deploy:deploy`**

### plugins
Plugin - is a java class assembled is a special way, which performs a certain functionality.

Every plugin contains its own goals, which can be executed with this plugin. 

There are lots of plugins exists for the maven, almost for any task you can think of. 
<br/>
https://maven.apache.org/plugins/
