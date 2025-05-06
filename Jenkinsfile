pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6'  
        jdk 'JDK 17' // Ensure this matches the tool name configured in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/nisar-a/optimize-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo '✅ Build and test completed successfully.'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}
