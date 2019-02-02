package polymorphicarray;

public class PolymorphicArray {

    public static void main(String[] args) {
       
        superClass obj[]  = new superClass[2];  //declare two instances of super class
        obj[0]= new classA();    //assign an object of each child class into the polymorphic array
        obj[1]= new ClassB();
        
        for (int i=0;i <=1;i++)
        {
            obj[i].display();
        }
    }
    
}
