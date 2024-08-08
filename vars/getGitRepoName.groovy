def call() {
    def gitRepoUrl = scm.getUserRemoteConfigs()[0].getUrl()
    def getRepoName = gitRepoUrl.tokenize('/').last().replaceAll(/\.git$/, '')
	
    return getRepoName
}