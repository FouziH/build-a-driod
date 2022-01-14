Defining a Droid
1.
The Droid.java file is empty.

Start by defining the class Droid.

Don’t forget to include a main() method! You can leave it empty for now.

We want a Droid object that has the following state:

name
battery level
and the following behavior:

performing a task
stating its battery level

Stuck? Get a hint
2.
Declare an instance field called batteryLevel. We want to store whole number values in this field.


Stuck? Get a hint
3.
Declare another instance field called name which will store our droid’s name.

What type should this be?


Stuck? Get a hint
4.
Create a constructor method for the Droid class.

The method should have one parameter of String droidName.


Stuck? Get a hint
5.
Inside the constructor, assign the parameter value of droidName to the appropriate instance field.

Set the value of batteryLevel to 100. Every new instance of Droid will have a batteryLevel of 100.


Stuck? Get a hint
Declaring Instances of Drone
6.
Inside main(), create a new instance of Droid named "Codey".


Stuck? Get a hint
7.
Print out the variable using System.out.println().


Stuck? Get a hint
8.
That output isn’t very informative!

Define a toString() method within Droid.

The return type is String.

Inside toString(), return a string that introduces the Droid using their name.

Something like “Hello, I’m the droid: droidNameHere”


Stuck? Get a hint
Doing Droid Things
9.
Define a new method: performTask(). This method should have a single parameter: String task.

This method does not return any value.


Stuck? Get a hint
10.
Inside performTask(), print a statement like “name is performing task: task“.

For example, codey.performTask("dancing"); will print:

Codey is performing task: dancing
11.
Performing tasks is hard work. After the print statement, set batteryLevel to be 10 less than it was before.

We’ll need to reassign the instance field to be the current value minus 10.


Stuck? Get a hint
12.
Have your Droid instance perform some tasks inside of main().


Stuck? Get a hint
Next steps
13.
Create new instances and play around with methods. Here are some ideas to get you started:

Create a energyReport() method that prints the instance’s batteryLevel.

Create another instance.

Create a method energyTransfer() that exchanges batteryLevel between instances.