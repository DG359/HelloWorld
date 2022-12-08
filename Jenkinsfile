pipeline {
	agent any

	stages{
		stage('<<<Initialise>>>') {
			steps {
				echo "PATH = ${PATH}"
				echo "M2_HOME = ${M2_HOME}"
			}
		}
		
		stage('<<<Build>>>') {
			steps {
				    withMaven {
      					sh "mvn clean verify"
    				} 
			}
		}
	} 
}