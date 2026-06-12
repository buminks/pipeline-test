class Utils implements Serializable {

    def steps

    Utils(steps) {
        this.steps = steps
    }

    void sayHello() {
        steps.echo("Hallo")
    }
}

Utils create(steps) {
    return new Utils(steps)
}

return this
