package diamond_operator;

public class Main {
  public static void main(String[] args) {
	  MyDiamond<Integer> myDiamond1 = new MyDiamond<>(1) {
		  
		  @Override
		  public void handle() {
			  System.out.println("handle > " + getContent());
		  }
	  };
	  myDiamond1.handle();
	  
	  MyDiamond<? extends Integer> myDiamond2 = new MyDiamond<>(10) {
		  
		  @Override
		  void handle() {
			  System.out.println("handle > " + getContent());
		  }
		  
	  };
	  myDiamond2.handle();
	  MyDiamond<?> myDiamond3 = new MyDiamond<>("One hundred") {
		  @Override
		  void handle() {
			  System.out.println("handle > " + getContent());
		  }
	  };
	  myDiamond3.handle();
  }
}
