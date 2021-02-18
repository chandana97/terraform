node{
    stage("checkout"){
        checkout scm
    }
    stage("build"){
      sh 'terraform init'
      sh 'terraform plan -out myplan'
    }
   
    stage("deploy"){
     sh 'terraform apply'
    }
}
