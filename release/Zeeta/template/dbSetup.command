#!/bin/sh
cd `dirname $0`
CP=./:../lib
CP=$CP:../lib/aopalliance-1.0.jar
CP=$CP:../lib/commons-logging-1.1.jar
CP=$CP:../lib/geronimo-jta_1.0.1B_spec-1.0.jar
CP=$CP:../lib/h2.jar
CP=$CP:../lib/javassist-3.4.ga.jar
CP=$CP:../lib/log4j-1.2.13.jar
CP=$CP:../lib/ognl-2.6.7.jar
CP=$CP:../lib/portlet-api-1.0.jar
CP=$CP:../lib/s2-dao-1.0.47.jar
CP=$CP:../lib/s2-dao-tiger-1.0.47.jar
CP=$CP:../lib/s2-extension-2.4.22.jar
CP=$CP:../lib/s2-framework-2.4.22.jar
CP=$CP:../lib/selj.jar
java -cp $CP jp.tokyo.selj.util.DbSetup