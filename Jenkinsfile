pipeline {
	environment {
	    registry = "https://registry.hub.docker.com"
	    registryCredentials = "docker"
	    artifact = ''
	}
	
    agent {
    	label 'none' 
  	}
  	tools {
        maven "maven"
        docker "docker"
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
                    artifact = docker.build("avinaba91/app/jenkins-springboot-app:myapp")
                }
            }
        }
		stage('Publish') {
            steps {				
                script {
                    docker.withRegistry(registry, registryCredentials) {
      					artifact.push()
    				}
                }
            }
        }
    }
}
