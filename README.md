To reproduce:

```
$ sbt bloopInstall
[info] Loading global plugins from /home/pkolaczk/.sbt/1.0/plugins
[info] Loading settings for project bloop-annotation-processor-failure-build from build.sbt ...
[info] Loading project definition from /home/pkolaczk/Projekty/DataStax/bloop-annotation-processor-failure/project
[info] Updating ProjectRef(uri("file:/home/pkolaczk/Projekty/DataStax/bloop-annotation-processor-failure/project/"), "bloop-annotation-processor-failure-build")...
[info] Done updating.
[info] Compiling 1 Scala source to /home/pkolaczk/Projekty/DataStax/bloop-annotation-processor-failure/project/target/scala-2.12/sbt-1.0/classes ...
[info] Done compiling.
[info] Loading settings for project root from build.sbt ...
[info] Set current project to bloop-annotation-processing (in build file:/home/pkolaczk/Projekty/DataStax/bloop-annotation-processor-failure/)
[info] Updating ...
[info] Done updating.
[success] Generated .bloop/root-test.json
[success] Generated .bloop/root.json
[success] Total time: 0 s, completed 2019-07-12 17:09:12
```

```
$ bloop compile root
Compiling root (2 Java sources)
[E] [E-1] Errors during annotation processing
[E] [E1] src/main/java/example/DateAdderImpl.java:36
[E]      Exception during annotation processing: java.lang.IllegalArgumentException: Not supported: sbt.internal.inc.javac.WriteReportingJavaFileObject@5df02ec6
[W]  [E-1] Supported source version 'RELEASE_7' from annotation processor 'com.github.misberner.duzzt.processor.DuzztMainProcessor' less than -source '1.8'
[E] src/main/java/example/DateAdderImpl.java: L36 [E1]
Compiled root (299ms)
[E] Failed to compile 'root'
```