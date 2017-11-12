#!/usr/bin/env groovy

def call() {
  sh "sudo rm -fR $WORKSPACE"
}
