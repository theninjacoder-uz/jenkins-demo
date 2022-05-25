pipeline {
  environment {
    imagename = "jenkinstest"
    registryCredential = 'test'
    dockerImage = ''
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
// //         sh "sudo usermod -a -G docker $USER"
        git([url: 'https://github.com/theninjacoder-uz/jenkins-demo.git', branch: 'master', credentialsId: 'test'])
 
      }
    }
//     stage('Building image') {
//       steps{
//         script {
//           dockerImage = docker.build imagename
//         }
//       }
//     }
//     stage('Deploy Image') {
//       steps{
//         script {
//           docker.withRegistry( '', registryCredential ) {
//             dockerImage.push("$BUILD_NUMBER")
//              dockerImage.push('latest')
//           }
//         }
//       }
//     }
//     stage('Remove Unused docker image') {
//       steps{
//         sh "docker rmi $imagename:$BUILD_NUMBER"
//          sh "docker rmi $imagename:latest"
 
//       }
//     }
//   }
    
    
    stage("compile") {
      steps{
       sh 'mvn compile'
      }
    }
    
    stage("package") {
      steps{
       sh 'mvn clean install'
      }
    }
     
    stage("run") {
      steps{
       sh 'java -jar jenkins-demo.jar'
      }
    }
}
}
