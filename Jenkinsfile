pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    def utils = load('src/de/firma/Utils.groovy').create(this)
                    def dockerUtils = load('src/de/firma/DockerUtils.groovy').create(this)

                    def foo = load('src/de/firma/Utils.groovy')

                    echo "${foo} -- ${foo.class.name}"

                    utils.sayHello()
                    dockerUtils.buildImage()
                }
            }
        }
    }
}
