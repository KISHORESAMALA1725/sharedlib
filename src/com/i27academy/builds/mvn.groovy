package com.i27academy.builds

class mvn {
    def jenkins
    mvn (jenkins) {
        this.jenkins = jenkins
    }

    def buildApp() {
        jenkins.sh """
        mvn package -DskipTest=true
        """
    }
}