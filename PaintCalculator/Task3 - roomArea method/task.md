
Assume the ceiling and walls will be painted the same color.

<img src="../../common/images/room.png" alt=prism width=150>

Add a new method named `roomArea` to compute the combined area of the ceiling and four walls.
The `roomArea` method should directly call the `ceilingArea` and `wallArea` methods.  Do not duplicate
the calculations in `roomArea`.

```java
   /**
 * roomArea - Returns the total ceiling and wall area given the room length, width, and height.
 * @param length - the room length as a double.
 * @param width - the room width as a double.
 * @param height - the room height as a double.
 * @return the total ceiling and wall area as a double.
 */
```

<div class="hint">
Algorithm:<br>
(1) Call <code>ceilingArea</code> method and store the result in a local variable<br>
(2) Call <code>wallArea</code> method and store the result in a local variable<br>
(3) Return the sum of the local variables<br>

You can also just return the sum of the two method calls without using
local variables, but it might be easier to debug the code using the local variables.
</div>

| Method Call                | Expected Result |
|----------------------------|-----------------|
| roomArea(15.0, 12.0, 10.0) | 720.0           |
| roomArea(7.5, 11.5, 8.25)  | 399.75           |

Update the `main` method to calculate and print the ceiling, wall, and room areas. 
Format the output as shown in the sample below.

```text
Enter room length, width and height.
15.0 12.0 10.0 
Ceiling area = 180.0
Wall area = 540.0
Room area = 720.0
```

Run the program to confirm the expected result is produced.

Check your solution to proceed to the next task.
