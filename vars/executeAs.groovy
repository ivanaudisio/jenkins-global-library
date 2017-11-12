#!/usr/bin/env groovy

def call(String user) {
  sh "sudo su -c 'whoami' -s /bin/sh ${user}"
}
