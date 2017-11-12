#!/usr/bin/env groovy

def call(String folder) {
  sh "sudo rm -fR /tmp/${folder}"
}
