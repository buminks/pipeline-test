class Utils implements Serializable {

    def steps

    static String name = "Utils"

    static setName(name) {
        this.name = name
    }

    Utils(steps) {
        this.steps = steps
    }

    void sayHello() {
        steps.echo("Hallo ${name}")
    }
}

Utils create(steps) {
    return new Utils(steps)
}

return this
