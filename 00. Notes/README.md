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
