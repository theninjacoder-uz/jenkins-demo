pipeline {
 
  agent any

  tools {
    maven 'Maven 3.8.5'
    jdk 'jdk9'
  }

  stages {
    
    stage("git clone"){
      steps {
            echo 'git cloning ...'
            git "https://github.com/theninjacoder-uz/jenkins-demo.git"
      }
    }

    stage("maven build"){
      steps {
          echo 'building application ...'
          sh "mvn package"
      }
    }

    stage("create docker image"){
         steps {
              echo 'creating docker image ...'
              sh "docker build -t jenkins-demo:latest ."
          }
        }
  }
}
