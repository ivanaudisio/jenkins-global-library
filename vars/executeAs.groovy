#!/usr/bin/env groovy

def call(String user) {
  sh "sudo su -c 'phing whoami' -s /bin/sh ${user}"
}
