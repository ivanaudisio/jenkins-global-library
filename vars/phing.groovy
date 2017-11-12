#!/usr/bin/env groovy

def call(String execute) {
  sh "sudo su -c 'phing ${execute}' -s /bin/sh symphony"
}
