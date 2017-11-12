#!/usr/bin/env groovy

def call(String folderName) {
  sh "tar -cvzf ${folderName}.tar.gz ${folderName}"
  sh "rm -fR ${folderName}"
}
