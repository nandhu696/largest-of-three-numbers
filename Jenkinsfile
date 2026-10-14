pipeline {
    agent any
    tools {
        maven 'M3'
    }
    stages {
        stage('Checkout') {
            steps { checkout scm }
        }
        stage('Build') {
            steps { bat 'mvn clean compile' }
        }
        stage('Test') {
            steps { bat 'mvn test' }
        }
        stage('Package') {
            steps { bat 'mvn package' }
        }
    }
    post {
        success { echo 'Java Maven JUnit build completed successfully' }
        failure { echo 'Build failed' }
    }
}