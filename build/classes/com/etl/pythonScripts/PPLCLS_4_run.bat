%~d0
cd %~dp0
java -Xms256M -Xmx1024M -cp .;../lib/routines.jar;../lib/log4j-1.2.16.jar;../lib/dom4j-1.6.1.jar;../lib/talendcsv.jar;../lib/mysql-connector-java-5.1.30-bin.jar;../lib/talend_file_enhanced_20070724.jar;pplcls_4_0_1.jar; local_project.pplcls_4_0_1.PPLCLS_4 --context=Default %* 