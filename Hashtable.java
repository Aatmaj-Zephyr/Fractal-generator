import java.util.ArrayList;
public class hashtable{
    int length; //length of the hash Array
    
    ArrayList <ArrayList> hasharray;
    //making a hash array storing arraylists
    
    hashtable(int arraylength){
        hasharray= new  ArrayList<ArrayList>();
        length=arraylength;
        //constructor to make a array list of array lists
        for (int i=0;i<length;i++){
            hasharray.add(new ArrayList<Complex>());
        }
        // The arraylist stores Complex numbers.
    }
    
    public void Add(Complex value){
       //Method to add value to the table. 
       //Do not confuse with the inbuilt arraylist method add()
       int key=hashfunction(value);
       
       if(!hasharray.get(key).contains(value)){
       hasharray.get(key).add(value);
       }
       /*
       hasharray.get(hashfunction(value)) is the Arraylist in the value'th position of hasharray. 
       We invoke it's add method to add the complex number.
       The number is added only if it doesn't already exist there
       */
    }
    
    protected int hashfunction(Complex key){
        //Function which returns the hashed value.
        //Treat as black-box do not modify or change the hashfunction
        return (int) (Math.floor(key.abs()*100))%length;
        //returns int value fro a complex value
    }   
    
    public boolean IsPresent(Complex z){
        //The method to check if the complex number exists or not.
        int key=hashfunction(z);
            //As complex objects are different, ArrayList.contains won't work. 
        for (int i=0;i<hasharray.get(key).size();i++){
            Complex a=(Complex) (hasharray.get(key).get(i));
            if(a.Real==z.Real&a.Imaginary==z.Imaginary){
                //If the two complex numbers are equal
                return true;
            }    
        }
        return false;
    }
    
    public void show(){
        //Method to print out the hashtable for debugging or any other use.
        for(int i=0;i<=length;i++){
            for(int j=0;j<hasharray.get(i).size();j++){
            Complex.print((Complex)(hasharray.get(i).get(j)));//Cast object to omplex
            System.out.print(" ");
            }
            System.out.println();
        }
    }
}
