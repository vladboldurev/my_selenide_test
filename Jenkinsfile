pipeline{
    agent any

    stages {
        stage("Build"){
            steps{
                sh 'mvn clean test'
            }
            post {
                success {
                    echo 'Success ...'
                    
                }
            }
        }
        stage("2_Test"){
            steps{
                echo "Start of Stage Test"
                echo "Building...."
                echo "End of Stage Test"
            }
        }
        stage("3 Deploy"){
            steps{
                echo "Start of Stage Deploy"
                echo "Building...."
                echo "End of Stage Deploy"
            }
        }
    }
}
