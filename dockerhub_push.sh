#!/usr/bin/env bash

./mvnw install docker:build
docker tag scottleedavis/mattermost-integrations:latest scottleedavis/mattermost-integrations
docker push scottleedavis/mattermost-integrations
