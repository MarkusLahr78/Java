package diamond_operator;

public abstract class MyDiamond<T> {
   private T content;
   
   public MyDiamond(T content) {
	   this.content = content;
	   System.out.println("Constructor for MyHandler with content: " + content.toString());
   }
   public T getContent( ) {
	   return content;
   }
   public void setContent(T content) {
	   this.content = content;
   }
   abstract void handle();
}
