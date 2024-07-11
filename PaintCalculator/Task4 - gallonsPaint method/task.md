Assume a gallon of paint covers 350 square feet.

Add a new method named `gallonsPaint` to calculate the gallons of paint
required to paint the ceiling and four walls. The method
should return the number of gallons **rounded up** to the nearest integer.

```java
  /**
* gallonsPaint - Returns the gallons of paint needed to cover the ceiling and walls given the room length, width, and height.
* @param length - the room length as a double
* @param width - the room width as a double
* @param height - the room height as a double
* @return the gallons of paint as an int
*/
```

The `gallonsPaint` method should call the `roomArea` method to get the square footage,
then calculate the number of gallons needed to cover that area.

<div class="hint">
Algorithm:<br>
(1) Call <code>roomArea</code> method to get the square footage as a double<br>
(2) Divide square footage by 350.0 to get the number of gallons as a double<br>
(2) Round the number of gallons up using <code>Math.ceil</code><br>
(3) Cast the result as an int and return that value

Feel free to introduce one or more local variables to store intermediate values during the calculation.
</div>


| Method Call                    | Expected |
|--------------------------------|----------|
| gallonsPaint(15.0, 12.0, 10.0) | 3        |
| gallonsPaint(7.5, 11.5, 8.25)  | 2        |

Update the `main` method to calculate and print the area along with the number
of gallons of paint. Format the output as shown in the sample below.

```text
Enter room length, width and height.
15.0 12.0 10.0 
Ceiling area = 180.0
Wall area = 540.0
Room area = 720.0
Gallons of paint = 3
```

Run the program to confirm the expected result is produced.

Check your solution to proceed to the next task.