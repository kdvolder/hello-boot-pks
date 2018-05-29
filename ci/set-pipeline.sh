#!/bin/bash
fly -t tools set-pipeline \
    --load-vars-from secrets.yml \
    -p "hello-boot-pks-master" \
    -c pipeline.yml
