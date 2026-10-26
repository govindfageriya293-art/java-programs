public class constructors {
    
        String name;
        int marks;
    
    public static void main(String[]args){
     
     constructors s1= new constructors();
     constructors s2= new constructors();
     s1.name = "govind";
     s1.marks= 466;

     s2.name= "manish";
     s2.marks= 404;

     System.out.println(" name . " + s1.name );
     System.out.println(" marks . " + s1.marks );
     System.out.println(" name . " + s2.name );
     System.out.println(" marks. " + s2.marks );
    
    }
}