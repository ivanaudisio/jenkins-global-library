#!/usr/bin/env groovy

def call(String newOwner) {
  sh "sudo chmod -R 777 $WORKSPACE"
  sh "sudo chown -R ${newOwner}:${newOwner} $WORKSPACE"
}
