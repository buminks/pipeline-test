pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    def Utils = load 'src/de/firma/Utils.groovy'
                    def DockerUtils = load 'src/de/firma/DockerUtils.groovy'

                    def utils = new Utils(this)
                    def dockerUtils = new DockerUtils(this)

                    utils.sayHello()
                    dockerUtils.buildImage()
                }
            }
        }
    }
}
