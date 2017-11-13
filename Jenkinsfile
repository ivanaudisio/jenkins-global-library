#!groovy
@Library('project-lib') _

pipeline {
    
    environment {
        playbook_folder = 'ansible'
        symfony_user    = 'symfony'
    }
    
    agent { label 'master'}
    stages {
        stage('Clone Repositories') {
            parallel {
                stage('Get Playbook') {
                    agent { label 'master'}
                    steps {
                        echo "On Branch A"
                    }
                }
                stage('Get Application') {
                    agent { label 'master'}
                    steps {
                        echo "On Branch B"
                    }
                }
            }
        }
        stage('Provision Environment') {
            steps {
                sh "echo provision env"
                deleteDir()
                dir("$playbook_folder") {
                    sh "touch text.txt"
                }
                compressFolder "$playbook_folder"
                uncompressFile "$playbook_folder"
                changeWorkspaceOwner "$symfony_user"
                executeAs "$symfony_user"
            }
        }
    }
}
