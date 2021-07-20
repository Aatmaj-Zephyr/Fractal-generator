public class Pentagonal_nflake extends Fractal{
    
    Pentagonal_nflake(){
        SetNumberOfVertices();
        SetVertices();
        Time=1000000;
        Range=400;
        Dot='o';
        
    }
    
    public void SetNumberOfVertices(){
        NumberOfVertices=5;
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
            seed=Complex.ScalarDivision(Complex.Addition(Vertex,Complex.ScalarDivision(seed,1.61803398875)),1.6180339887498);
            //The algorithm for the fractal
            Hashtable.Add(normalized(seed));
        }
    }
}
