def create(steps) {
    return [
        buildImage: { ->
            steps.echo("Docker Image bauen")
        }
    ]
}

return this
