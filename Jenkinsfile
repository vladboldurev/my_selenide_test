properties([pipelineTriggers([githubPush()])])

node {
    stage ('Checkout'){
        git branch: '*/main', url: 'git@github.com:vladboldurev/my_selenide_test.git'
    }
    stage ('Test'){
        steps {
            sh 'mvn -f pom.xml clean test '
        }
    }
    
}   
