pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                script {
                    // def utils = load('src/de/firma/Utils.groovy').create(this)
                    def dockerUtils = load('src/de/firma/DockerUtils.groovy').create(this)

                    def foo = load('src/de/firma/Utils.groovy')

                    echo "${foo} -- ${foo.class.name}"

                    def foo1 = foo.create(this)
                    foo1.sayHello()

                    def foo2 = foo.create(this)
                    foo2.sayHello()

                    // utils.sayHello()
                    dockerUtils.buildImage()
                }
            }
        }
    }
}
