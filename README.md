# burp-terminal

Burpsuite插件，给Burpsuite新增一个终端功能

# 安装依赖

```bash
mvn install:install-file -Dfile=libs/jediterm-core-3.20-SNAPSHOT.jar -DgroupId=com.jediterm  -DartifactId=jediterm-core -Dversion=3.20-SNAPSHOT -Dpackaging=jar
mvn install:install-file -Dfile=libs/jediterm-ui-3.20-SNAPSHOT.jar -DgroupId=com.jediterm  -DartifactId=jediterm-ui -Dversion=3.20-SNAPSHOT -Dpackaging=jar

```