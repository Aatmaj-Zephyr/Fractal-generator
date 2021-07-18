public class Complex{
    
    /*
    Complex numbers are not supported in Java as directly and easily as in Python or other languages.
    Hence, it is a good idea to write a new class of Complex values.
    Every complex number is just an instance of this class.
    The instance veriables are Real and the Imaginary parts. 
    We can define a complex number using the Constructor.
    This class contains static methods for Complex operations as well
    */
    
    double Real; //Real pert of the complex number
    double Imaginary; //Imaginary part of the complex number.
    Complex(){
        //default constructor to set value of complex numbers coordinates to zero.
        Real=0;
        Imaginary=0;
    } 
    
    Complex(double x, double y){
        //Parametrize constructor to set the values of the complex number..
        Real=x;//Set x value
        Imaginary=y;//Set y value
    }
    
    
    //Complex functions
    public double abs(){
        //Non-static method which is used to get the absolute value of the complex number.
        return Math.sqrt(Real*Real+Imaginary*Imaginary);
    }
    public static Complex Addition(Complex a, Complex b){ 
        //Add two complex numbers.
        //Doo not confuse with the Add method in the hashtable
        //static method which can be used everywhere.
        return new Complex(a.Real+b.Real,a.Imaginary+b.Imaginary);
    }
    
    //Divide be a scalar number. eg i/2
    
    public static Complex ScalarDivision(Complex a, double b){
        //static method which can be used everywhere.

        if(b==0.0){
            return new Complex(0,0); //Divide by zero not possible
        }
        else {
            return new Complex(a.Real/b,a.Imaginary/b); 
            //Return the Complex value.
        }
    }
	

}
