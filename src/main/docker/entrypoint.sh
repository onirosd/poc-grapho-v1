#!/bin/sh
# JAVA_OPTS="$JAVA_OPTS -javaagent:/applicationinsights-agent-3.5.0.jar"
# java $JAVA_OPTS -Djavax.net.ssl.trustStorePassword=changeit -Djava.security.egd=file:/dev/./urandom -jar /app.jar
java $JAVA_OPTS -Djavax.net.ssl.trustStorePassword=changeit -Djava.security.egd=file:/dev/./urandom -jar /app.jar
