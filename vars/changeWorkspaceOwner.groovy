#!/usr/bin/env groovy

def call(String newOwner) {
  sh "sudo chown -R ${newOwner}:${newOwner} $WORKSPACE"
  sh "sudo chmod 775 $WORKSPACE"
}
