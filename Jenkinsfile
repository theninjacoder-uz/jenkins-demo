pipeline {
 
  agent any
  
  stages {
    
    stage("git clone"){
      steps {
            echo 'git cloning ...'
            git 'https://github.com/theninjacoder-uz/jenkins-demo.git'
      }
    }

    stage("maven build"){
      steps {
          echo 'building application ...'
          sh 'mvn package'
      }
    }

    stage("create docker image"){
         steps {
              echo 'creating docker image ...'
              sh 'docker build -t jenkins-demo:latest .'
          }
        }
  }
}
