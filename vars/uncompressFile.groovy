#!/usr/bin/env groovy

def call(String folderPath) {
  sh "tar -xvzf ${folderPath}.tar.gz ${folderPath}"
  sh "rm -fR ${folderPath}"
}
