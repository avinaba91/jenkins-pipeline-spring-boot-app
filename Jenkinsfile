pipeline {
	environment {
	    registry = "avinaba91/app/jenkins-springboot-app"
	    registryCredentials = "docker"
	    dockerImage = ''
	}
	
    agent any
    
  	tools {
        maven "maven"
        dockerTool "docker"
    }
    stages {
		stage('Build') {
            steps {
                sh 'mvn clean install -Dmaven.test.skip=true'
            }
        }
		stage('Package') {
            steps {
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
		stage('Publish') {
            steps {				
                script {
                    docker.withRegistry( '', registryCredential )
            		dockerImage.push()
                }
            }
        }
    }
}
