pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    def utilsClass = load 'src/de/firma/Utils.groovy'
                    def dockerUtilsClass = load 'src/de/firma/DockerUtils.groovy'

                    def utils = utilsClass.newInstance(this)
                    def dockerUtils = dockerUtilsClass.newInstance(this)

                    utils.sayHello()
                    dockerUtils.buildImage()
                }
            }
        }
    }
}
