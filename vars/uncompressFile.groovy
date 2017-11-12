#!/usr/bin/env groovy

def call(String fileName) {
  sh "tar -xvzf ${fileName}.tar.gz ${fileName}"
  // sh "rm -fR ${fileName}"
}
