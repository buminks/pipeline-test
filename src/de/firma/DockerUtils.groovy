package de.firma

class DockerUtils implements Serializable {

    def steps

    DockerUtils(steps) {
        this.steps = steps
    }

    void buildImage() {
        steps.echo("Docker Image bauen")
    }
}
