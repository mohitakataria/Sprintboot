node{
   stage('git checkout'){
        git 'https://github.com/mohitakataria/Sprintboot.git'
    }
    stage('code build & test'){
        def mavenHome = tool name: 'maven-3' , type: 'maven'
        def mavenCMD = "${mavenHome}/bin/mvn"
        sh "${mavenCMD} clean package"
    }
    stage('docker build'){
        sh "docker build -t mohitakataria/springboot01:5.0.0 ."
        withCredentials([usernamePassword(credentialsId: 'mohidoc', passwordVariable: 'dockerpwd', usernameVariable: 'dockeruser')]) { 
            sh "docker login -u ${dockeruser} -p ${dockerpwd}"
        }
    }
    stage('docker push'){
        sh 'docker push mohitakataria/springboot01:5.0.0'
    }
    stage('docker run'){
        sh 'docker run -p 8888:8080 -d mohitakataria/springboot01:5.0.0'
    }
}
