
public abstract class Fractal
// Methods marked main for flexibility
{
  int NumberOfVertices;
  // The number of verices boundry of the fractal.
  // Example, triangle-3, rectangle-4, pentagon-5

  int Range;
  // the range of the value to be printed

  int Time;
  // The number of time the loops must be run.
  // More the time, more the precisiomn

  char Dot;
  // The character to be printed example *, A, . etc etc

  hashtable Hashtable;
  // The Hashtableashtable to store the values.

  Complex[] vertices;
  // Vertices of the fractal

  public abstract void SetNumberOfVertices();
  // Set the vertices positions
  // To be overridden as it is unique for every fractal

  public void SetVertices() {
    // Set the number of vertices
    // By default set the equidistant from the origin.
    // To be overridden if the values are not equidistant for every fractal.
    SetEquidistant();
  }

  public void SetEquidistant() {
    // Set the vertices equidistant form the origin at distance 1.
    vertices = new Complex[NumberOfVertices];
    for (int k = 0; k < NumberOfVertices; k++) {
      // Be carefull at the loop, else index out of bounds exception is generated
      // Roots of unity
      vertices[k] =
          new Complex(
              Math.cos((2 * Math.PI * k) / NumberOfVertices),
              Math.sin((2 * Math.PI * k) / NumberOfVertices));
    }
  }

  public final void print() {
    /*
    This is a method to display the final outputs.
    Made non mutable because same structure for every fractal.
    */
    /*test code.
    //Hashtable.show();
    //Hashtable.Add(new Complex(0,0));
    //System.out.println(Hashtable.IsPresent(new Complex(0,0)));
    */
    for (int i = -Range; i <= Range; i++) {
      for (int j = -Range; j <= Range; j++) {
        Complex z = new Complex(i / 1, j / 1);
        if (Hashtable.IsPresent(z)) {
          System.out.print(Dot);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public abstract void go();
  // The main thing where all code is executed.

  public final int RandomVertexGenerator() {
    /*
    This is a method wich returns random numbers between 1 to NumberOfVerices-1 for chaos game to take place.
    Note that this method just gives random numbers.
    This must not be modified for giving other numbers with respect to specific constrainst.
    Example one fractal has the condition that vertices cannot be repeated.
    or next vertex must be chosen.
    In such cases, use other methods, but do not override this method. Hence marked as final.
    Do not confuse with the set initial seed method which sets the initial random value.
    THIS METHOD IS CALLED FOR A LARGE NUMBER OF TIMES.
    */
    return (int) Math.floor(Math.random() * NumberOfVertices);
  }

  public final Complex SetInitialSeed() {
    /*
    Sets the initial seed equal a random number from 0,1.
    Can be just equal to zero also.
    return new Complex(0.0,0.0)
    */
    return new Complex(Math.random(), Math.random());
  }

  public Complex normalized(Complex seed) {
    // Normalize the number
    return new Complex(Math.floor(seed.Real * Range), Math.floor(seed.Imaginary * Range));
  }
}
