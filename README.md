# Basic Calculator GUI

Basic calculator app I wrote while learning Swing. This time around, I used the NetBeans IDE to build and design the GUI. When searching the web for Swing tutorials, it seemed that most of them were using this IDE to make their GUI. It also seemed far easier than writing
components individually so I decided to give it a whirl. 

One problem we run into as devs is processing user input. In particular, we have the choice of limiting user input during the input stage, or adding more cases to catch in the processing stage. The more you limit the input, the less cases you need to worry about when
processing. The opposite is also true for processing. When you add more guardrails to the processing stage, you do not need to limit input as much. For example, if you limit the input to a string that is comprised of only numbers, then you can convert to an integer without
issue. However, you could also verify the string as being comprised of only numbers in the processing stage, then reject strings that do not fit that criteria. Limiting input tends to be far easier than catching bad input in the processing stage (at least from my experience),
but there are many times when you cannot limit input as much as you'd like. In the case of this app, I had the advantage that the input would already only been comprised of numbers and operations. I took this a step further by making it so you could not chain operation 
(i.e. 2++2) together as well. Any input that had chained operations would result in an automatic error, and writing guardrails in the processing stage was both tedious and time consuming. Limiting the input like this also made it so the data was always in the form of 
"number, operation, number", which made processing far easier. 
