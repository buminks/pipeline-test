pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    def utils = load('src/de/firma/Utils.groovy').create(this)
                    def dockerUtils = load('src/de/firma/DockerUtils.groovy').create(this)

                    utils.sayHello()
                    dockerUtils.buildImage()
                }
            }
        }
    }
}
