pipeline {
    agent any
    def foo = load('src/de/firma/Utils.groovy')
    def dockerUtils = load('src/de/firma/DockerUtils.groovy')

    stages {
        stage('Test') {
            steps {
                script {
                    // def utils = load('src/de/firma/Utils.groovy').create(this)


                    echo "${foo} -- ${foo.class.name}"

                    def foo1 = foo.create(this)
                    foo1.setName("Foo1")
                    foo1.sayHello()

                    def foo2 = foo.create(this)
                    foo2.setName("Foo2")
                    foo2.sayHello()

                }
            }
        }
    }
}
