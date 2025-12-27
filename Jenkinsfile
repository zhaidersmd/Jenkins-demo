pipeline {
	agent any
	environment {
		GIT_CREDS = credentials('git-creds')
	}
	stages {
		stage('checkout') {
			steps {
				git branch: 'main',
					url: 'https://github.com/zhaidersmd/Jenkins-demo.git'
			}
		}
		
		stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        
         stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
		
		
	}
}
