pipeline {
	agent any
	tools {
		maven 'Maven 3.8.6'
		jdk 'jdk8'
	}
	
	stages{
		stage('<<<Initialise>>>') {
			steps {
				echo "PATH = ${PATH}"
				echo "M2_HOME = ${M2_HOME}"
			}
		}
		
		stage('<<<Build>>>') {
			steps {
				sh 'mvn spring-boot:run'
			}
		}
	}
}