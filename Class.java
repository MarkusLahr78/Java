
public class Class<E> {
private E attribute;
    
    public void set (E value){
        this.attribute = value;
    }
    
    public E get(){
        return attribute;
    }
    public static void main(String[] args){
        Class<Integer> myClass = new Class<Integer>();
        Class<String> yourClass = new Class<String>();
        //Java 7, diamond operator: 
        //Class<Integer> myClass = new Class<>();
        //Class<String> yourClass = new Class<String>();
        myClass.set(0);
        yourClass.set("0");
        System.out.println(myClass.get() + yourClass.get());
    }
}
