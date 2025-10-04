### IF Statements 
---
**Syantax:**
```java
if (condition) {
	........
}else{
	......
}
```

```java

import.java.util.Scanner;

public class Main {
	public static void main (String [] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age" );
		int age = sc.nextInt();
		
		if ( age >= 18 ) {
			System.out.println("You are eligibile to vote");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}
}
```

#### Output 
```java 

Enter your age: 18
You are eligible to vote.

```

