def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    echo "please build"
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this
