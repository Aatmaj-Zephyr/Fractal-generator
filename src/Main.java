public class Main {
  public static void main(String[] args) {
    Fractal triangle = new Sierpinski_Triangle();
    Writer.setFile("fractal.txt");
    triangle.go();
    triangle.print();
  }
}
