# jenkins-global-library

### Example of library structure

```
vars/
    deployApp.groovy
    parseFile.groovy
    sayHello.groovy
```

### Example of `sayHello.groovy` file

```
#!/usr/bin/env groovy

def call(String name = 'human') {
  echo "Hello, ${name}."
}
```

### Configuration of Jenkins library

In Jenkins, go to Manage Jenkins → Configure System. Under Global Pipeline Libraries, add a library with the following settings:

- Name: `pipeline-library-demo`
- Default version: `Specify a Git reference (branch or commit SHA), e.g. master`
- Retrieval method: `Modern SCM`
- Select the Git type
- Project repository: `repository url for the library`

### Call the library from the Jenkinsfile

```
@Library('pipeline-library-demo')_

stage('Demo') {
    echo 'Hello world'
    sayHello 'Dave'
}
```

#### sources
https://cleverbuilder.com/articles/jenkins-shared-library/
