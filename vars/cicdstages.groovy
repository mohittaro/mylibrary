def contDownload(repo)
{
  git "https://github.com/prasadcloud/${repo}"
}
def contBuild()
{
  sh 'mvn package'
}
def contDepl(Jobname,IPaddress,context)
{
  sh "scp /var/lib/jenkins/workspace/${Jobname}/webapp/target/webapp.war ubuntu@${IPaddress}:/var/lib/tomcat9/webapps/${context}.war"
}

