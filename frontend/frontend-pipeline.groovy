pipeline{
    agent any 
    stages{
        stage('Code-pull'){
            steps{
                git branch: 'main', url: 'https://github.com/Pritam280/flight-reservation.git'
            }
        }
    }
}
