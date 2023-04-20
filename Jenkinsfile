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
        stage('Sonar') {
            steps {
              withSonarQubeEnv('sonar') {
                    sh "chmod +x gradlew && ./gradlew sonar"
                  }
                waitForQualityGate abortPipeline: true
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
