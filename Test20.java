package edu4;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildrenBook chb = new ChildrenBook(15, "PW press", 1987, 8);
	    ComicBook cb = new ComicBook(14, "PW press", 1924, "Batman");
	    
	    System.out.println(chb.getPublisher());
	    System.out.println(cb.computeSalePrice());
	    System.out.println(chb.computeSalePrice());
	    System.out.println(cb.getRegularPrice());

	}

}
