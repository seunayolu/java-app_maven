def gv

pipeline {
    agent any
    tools{
        maven 'maven'
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    echo "building jar"
                    gv.buildJar()
                }
            }
        }
        stage("build image docker") {
            steps {
                script {
                    echo "deploying"
                    gv.buildImageDockerhub()
                }
            }
        }

        stage("deploy") {
            steps {
                script {
                    echo "deploying"
                }
            }
        }


    }   
}
