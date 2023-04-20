void setBuildStatus(String message, String state) {
  step([
      $class: "GitHubCommitStatusSetter",
      reposSource: [$class: "ManuallyEnteredRepositorySource", url: "https://github.com/OlhaKolos/atap-report-portal"],
      contextSource: [$class: "ManuallyEnteredCommitContextSource", context: "Sonar check"],
      errorHandlers: [[$class: "ChangingBuildStatusErrorHandler", result: "UNSTABLE"]],
      statusResultSource: [ $class: "ConditionalStatusResultSource", results: [[$class: "AnyBuildResult", message: message, state: state]] ]
  ]);
}

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Hello World from build'
            }
          
        }
        stage('Hello') {
            steps {
                echo 'Hello World'    
            }
        }
    }
    
  post {
    success {
        setBuildStatus("Build succeeded", "SUCCESS");
    }
    failure {
        setBuildStatus("Build failed", "FAILURE");
    }
  }
}
