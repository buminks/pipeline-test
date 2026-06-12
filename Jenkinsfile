import de.firma.Utils
import de.firma.DockerUtils

pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    def utils = new Utils(this)
                    def dockerUtils = new DockerUtils(this)

                    utils.sayHello()
                    dockerUtils.buildImage()
                }
            }
        }
    }
}
