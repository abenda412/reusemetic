# Reusemetic
A reusable arithmetic library. This library can complete basic math operations and handles a variety of input types. 

A jar of the library can be built by running a maven package. Once that jar is built it can be added as a dependency to any other java project for quick and easy use. 

# Key Features: 
- Addition, subtraction, multiplication, division operations
- Accepts various types to each operation method
- Works with hexadecimal and octal numbers

# Integrating Reusemetic: 
To integrate the Reusemetic library into your project
- Clone the repository
- Navigate to the project root and run the "mvn package" command to build a jar in the /target dir
- Copy the jar into your project's /resources dir
- Add the following to your pom.xml
```
<dependency>
  <groupId>org.example</groupId>
  <artifactId>math</artifactId>
  <version>1.0-SNAPSHOT</version>
  <scope>system</scope>
  <systemPath>${project.basedir}/src/main/resources/math-1.0-SNAPSHOT.jar</systemPath>
</dependency>
```

# Example: 
```
import org.math.MathOps;

Double result = MathOps.add(1,2);
System.out.println("Result of 1+2 = " + result);
```
