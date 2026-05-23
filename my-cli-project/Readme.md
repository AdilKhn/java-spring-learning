created with:

mvn archetype:generate \
  -DgroupId=com.example.app \
  -DartifactId=my-cli-project \
  -DarchetypeArtifactId=maven-archetype-quickstart \
  -DarchetypeVersion=1.5 \
  -DinteractiveMode=false



Run the main with:
 mvn exec:java -Dexec.mainClass="com.example.app.App"

Run tests with 
mvn test
