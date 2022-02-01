public class Sierpinski_Triangle extends Fractal {

  Sierpinski_Triangle() {
    SetNumberOfVertices();
    SetVertices();
    Time = 100000;
    Range = 100;
    Dot = '*';
  }

  public void SetNumberOfVertices() {
    NumberOfVertices = 3;
  }

  public void go() {
    Complex seed, Vertex;

    Hashtable = new hashtable(100);
    // Length of the hashtable is to be set according to the time taken for the execution.

    seed = SetInitialSeed();
    // Set the initial seed

    for (int i = 0; i <= Time; i++) {
      Vertex = vertices[RandomVertexGenerator()]; // Set the random Vertex
      seed = Complex.ScalarDivision(Complex.Addition(seed, Vertex), 2.0);
      Hashtable.Add(normalized(seed));
    }
  }
}
