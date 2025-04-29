def call(){
  dependencyCheck(
    additionalArguments: '--scan ./ --nvdApiKey f1f92557-d196-4d3f-bec2-72e1fe4d6b0c',
    odcInstallation: 'OWASP'
  )
  dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
  archiveArtifacts artifacts: '**/dependency-check-report.*', allowEmptyArchive: true
}
