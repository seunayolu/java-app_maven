def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildMyImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
         sh 'docker build -t omosefunmi/demo-app:jma-2.0  .'
         sh "echo $PASS | docker login -u $USER --password-stdin"
         sh 'docker push omosefunmi/demo-app:jma-2.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
