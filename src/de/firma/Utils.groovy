class Utils implements Serializable {

    def steps

    Utils(steps) {
        this.steps = steps
    }

    void sayHello() {
        steps.echo("Hallo")
    }
}

return Utils
