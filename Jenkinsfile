pipeline {
 
  agent any

  tools {
    jdk "jdk-1.8.101"
  }

  stages {
    

    stage('Build'){
        steps{
           configFileProvider([configFile(fileId: 'my-maven-settings-dot-xml', variable: 'MAVEN_SETTINGS_XML')]) {
                sh 'mvn -U --batch-mode -s $MAVEN_SETTINGS_XML clean install -P foo'
            }
        }
    }

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
