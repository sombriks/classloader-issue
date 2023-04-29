# classloader issue

sampe code for [this issue](https://stackoverflow.com/questions/76138369/java-io-filenotfoundexception-from-jar-with-fileinputstream)

## testing

```bash
./mvnw clean install
java -jar target/classloader-issue-1.0-SNAPSHOT.jar /root-resource.txt # ok
java -jar target/classloader-issue-1.0-SNAPSHOT.jar classpath-resource.txt #ok
java -jar target/classloader-issue-1.0-SNAPSHOT.jar ../another/classpath-resource.txt #fail
```