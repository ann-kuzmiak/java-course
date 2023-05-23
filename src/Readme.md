
At first Parent class static initialization block is executed at the time when class is loaded:
```
Static init block in parent
 ```
Then static block of Child class is executed:
```
Static init block in child
```
After this: 
at first non-static block of Parent class is executed
```
Init block in parent
```
Then non-static block of child class is executed
```
Init block in child
```
