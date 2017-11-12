#!/usr/bin/env groovy

def call(String folderPath) {
  sh "tar -cvzf ${folderPath}.tar.gz ${folderPath}"
  sh "rm -fR ${folderPath}"
}
