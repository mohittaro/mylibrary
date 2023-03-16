def contDownload(repo)
{
  git "https://github.com/prasadcloud/${repo}"
}
def contBuild()
{
  sh 'mvn package'
}
