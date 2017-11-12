#!/usr/bin/env groovy

def call(String folder-path) {
  sh "tar -xvzf ${folder-path}.tar.gz ${folder-path}"
  sh "rm -fR ${folder-path}"
}
