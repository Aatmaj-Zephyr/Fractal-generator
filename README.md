# Fractal-generator
Fractal generator using the Chaos game. This is a program which makes use of Object Oriented programming. Fractals like Seirpinski triangle are generated using the 'Chaos Game' .
____
The program makes a hierchy of two classes, abstract Fractal.java and it's sub-classes. In the sub classes, methods to set the initial coorners and  to make a hashtable of coordinates generated from the Chaos game arepresent. The fractal superclass contains methods to print the hashtable as a coordinate graph on the command line, normalize thae values iin  a given range, etc. 

The main.java makes references to all the subclasses and runs the methods polymorphicially.

Complex numbers class is made to support the 2d argand plane. This was needed as Java doesn't directly and easily support the complex numbers like Python, Julia and other modern languages. It also was a good exercise and gave a lot of flexibility. This helped me clearly understand object oriented concepts like returning objects and static methods.

Check out the flowchart folder for learning more about the class hierchy!
