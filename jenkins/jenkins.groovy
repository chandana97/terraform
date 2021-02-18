node{
    stage("checkout"){
        checkout scm
    }
    stage('TF Plan') {
       steps {
         container('terraform') {
           sh 'terraform init'
           sh 'terraform plan -out myplan'
         }
       }
     }
   
    stage("deploy"){
     sh 'terraform apply'
    }
    
}
