public class Sierpinski_Carpet extends Fractal{
    
    Sierpinski_Carpet(){
        SetNumberOfVertices();
        SetVertices();
        Time=1000000;
        Range=200;
        Dot='*';
        
    }
    public void SetEquidistant(){
        //For this fractal
        vertices= new Complex[NumberOfVertices];
        //mind the order of the vertices. must be cyclic
        vertices[0]= new Complex(0,1);
        vertices[1]= new Complex(0,-1);
        vertices[2]= new Complex(-1,0);
        vertices[3]= new Complex(1,0);
        vertices[4]= new Complex(0,0.5);
        vertices[5]= new Complex(0,-0.5);
        vertices[6]= new Complex(-0.5,0);
        vertices[7]= new Complex(0.5,0);
        
    }
    public void SetNumberOfVertices(){
        NumberOfVertices=8;
    }
    
    public void go(){
        Complex seed,Vertex;
        
        Hashtable= new hashtable(100);
        //Length of the hashtable is to be set according to the time taken for the execution.
        
        seed=SetInitialSeed();
        //Set the initial seed
        
        for (int i=0;i<=Time;i++){
            Vertex=vertices[RandomVertexGenerator()];
            //Set the random Vertex
            seed=Complex.ScalarDivision(Complex.Addition(seed,Complex.ScalarDivision(Vertex,0.5)),3);
            //The algorithm for the fractal
            Hashtable.Add(normalized(seed));
        }
    }
}
