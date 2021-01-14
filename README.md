###forked from [a1098832322/shimeji](https://github.com/a1098832322/shimeji)


###安装 priv_lib 目录下的私有依赖
* AbsoluteLayout

```
mvn install:install-file -Dfile=AbsoluteLayout.jar -DgroupId=com.wishes -DartifactId=AbsoluteLayout-origin -Dversion=1.0 -Dpackaging=jar
```
* examples

```
mvn install:install-file -Dfile=examples.jar -DgroupId=com.wishes -DartifactId=examples-origin -Dversion=1.0 -Dpackaging=jar
```
* jna

```
mvn install:install-file -Dfile=jna.jar -DgroupId=com.wishes -DartifactId=jna-origin -Dversion=1.0 -Dpackaging=jar
```
* forms_rt.jar

```
mvn install:install-file -Dfile=forms_rt.jar -DgroupId=com.idea -DartifactId=forms -Dversion=1.0 -Dpackaging=jar
```
* beautyeye.jar

```
mvn install:install-file -Dfile=beautyeye.jar -DgroupId=org.lnf -DartifactId=beautyeye -Dversion=1.0 -Dpackaging=jar
```