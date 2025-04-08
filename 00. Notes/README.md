# Java

## Command line arguments

```java
public class MyProgram {
    public static void main(String[] args) {
        // args is an array of Strings
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + i + ": " + args[i]);
        }
    }
}
```
```bash
#compile
javac MyProgram.java
```
```bash
#run
java MyProgram hello world 123
```
```yaml
#output
Argument 0: hello
Argument 1: world
Argument 2: 123
```
