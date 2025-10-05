| Type      | Example      | Size   | Description                        |
| --------- | ------------ | ------ | ---------------------------------- |
| `byte`    | 100          | 1 byte | Small integer (range: -128 to 127) |
| `short`   | 20000        | 2 byte | Medium integer                     |
| `int`     | 123456       | 4 byte | Default integer type               |
| `long`    | 999999L      | 8 byte | Large integer                      |
| `float`   | 3.14f        | 4 byte | Decimal numbers (less precision)   |
| `double`  | 3.14159      | 8 byte | Decimal numbers (high precision)   |
| `char`    | 'A'          | 2 byte | Single character (Unicode)         |
| `boolean` | true / false | 1 bit  | Logical values                     |

```java

class main {
	public static void main (String[] args) {
		
		int age = 10;
		double price = 99.99;
		char grade = 'C' ;
		boolean isPass = true;
		
		System.out.println(age+ " " + price + " " + grade + " " + isPass) ;
	}
}
```


[[datatypes_01.java]]

