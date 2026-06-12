def create(steps) {
    return [
        sayHello: { ->
            steps.echo("Hallo")
        }
    ]
}

return this
