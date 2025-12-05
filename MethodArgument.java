package learnautomation;

public class MethodArgument  {
	  public void takePhoto() {
		System.out.println("Take photo");
	  }
	  public void makeCall(String number) {
	    	System.out.println(number);
	   }
	
	   public static void main(String[] args) {
		    MethodArgument obj=new MethodArgument();
		    obj.takePhoto();
		    obj.makeCall("231121101098");
	}

}
