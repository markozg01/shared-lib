def call(String repoUrl, String branch){
   println("checking out code")
   def workingDir = "${env.WORKSPACE}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"
   println("END CHECKING OUT")
   return workingDir
}