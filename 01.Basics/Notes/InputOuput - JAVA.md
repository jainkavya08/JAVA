### Output in Java 
---

```java

public class inputouput {
	public static void main (String[] args) {
		
		System.out.println("Hello world");   // With Newline
		System.out.print("Hello ");   // Without Newline
		System.out.printf ("Numbers %d :", 10);  // Formatted 
	}
}


```

## Taking Input In Java 

```java

import java.util.Scanner;

public class inputouput {
	public static void main ( String [] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("My name is " + name + " my age is " age) ;
		
		
	}
}

```

👉 Methods of `Scanner`:
--- 
- `nextLine()` → string (whole line)
- `next()` → single word
- `nextInt()` → integer
- `nextDouble()` → decimal
- `nextBoolean()` → true/false


