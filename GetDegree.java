package getdegree;
class degree{
    void get(){
    
        System.out.println("I Got Degree");
        
    }
   
}
class undergraduate extends degree{
    void graduation(){
        System.out.println("I am an Undergraduate");
    }
}
class postgraduate extends degree{
    void graduation(){
        System.out.println("I am a Postgraduate");
        
    }
}
 public class GetDegree{
    public static void main(String args[]){
    degree m=new degree();
        postgraduate post = new postgraduate();
    undergraduate under = new undergraduate();
    m.get();
    post.graduation();
    under.graduation();
    
        
    }
}