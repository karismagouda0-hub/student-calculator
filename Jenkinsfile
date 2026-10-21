
pipeline {
    agent any

    options {
        skipDefaultCheckout(true)
        timeout(time: 10, unit: 'MINUTES')
    }

    parameters {
        booleanParam(
            name: 'RUN_APP',
            defaultValue: false,
            description: 'Run the calculator application'
        )
    }

    stages {
        stage('Checkout') {
            steps {
                deleteDir()
                checkout scm
            }
        }

        stage('Verify') {
            steps {
                bat 'git --version'
                bat 'java -version'
                bat 'mvn -version'
                bat 'mvn clean test'
            }
        }

        stage('Package and Archive') {
            steps {
                bat 'mvn package'
                archiveArtifacts artifacts:
                    'target/student-calculator-*.jar',
                    fingerprint: true
            }
        }

        stage('Run Application') {
            when {
                expression { params.RUN_APP }
            }
            steps {
                bat 'java -jar target/student-calculator-1.0-SNAPSHOT.jar'
            }
        }
    }

    post {
        always {
            junit allowEmptyResults: true,
                testResults: 'target/surefire-reports/*.xml'
        }

        success {
            echo 'Calculator CI completed successfully'
        }

        failure {
            echo 'Calculator CI failed'
        }
    }
}
