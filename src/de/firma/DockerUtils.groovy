class DockerUtils implements Serializable {

    def steps

    DockerUtils(steps) {
        this.steps = steps
    }

    void buildImage() {
        steps.echo("Docker Image bauen")
    }
}

DockerUtils create(steps) {
    return new DockerUtils(steps)
}

return this
