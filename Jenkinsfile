pipeline {
	agent any
	environment {
		GIT_CREDS = credentials('gituserpass')
		APP_NAME = "jenkins-demo-Env"
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
				sh 'echo "Using secured credentials"'
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
