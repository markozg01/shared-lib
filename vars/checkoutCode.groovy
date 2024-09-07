def call(String repoUrl, String branch){
   println("checking out code1")
   def workingDir = "${env.WORKSPACE}"
   println("checking out code2")
   sh "git clone ${repoUrl} ${workingDir}"
   println("checking out code3")
   sh "git checkout ${branch}"
   println("checking out code4")
   println("END CHECKING OUT")
   return workingDir
}