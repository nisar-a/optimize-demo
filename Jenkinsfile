pipeline {
    agent any

    tools {
        maven 'Maven 3.9.6'   // Ensure this name matches your Jenkins global tool configuration
        jdk 'JDK 17'          // Correct keyword for defining JDK tool
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
