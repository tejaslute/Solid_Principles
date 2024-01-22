import java.util.*;
import java.lang.*;

class Remote{
	public void remotefunction() {
		System.out.println("In remote function ");
	}

	
}

class TV extends Remote{
	@Override
	public void remotefunction() {
		System.out.println("Using an tv remote ");
	}
	
}
class Radio extends Remote{
	@Override
	public void remotefunction() {
		System.out.println("Using an Radio remote ");
	}
	
}

public class Liskov{
	
	public void remote(Remote r)
	{
		r.remotefunction();
	}
	
	public static void main(String args[]) {
		

		Remote r= new TV();
		Remote r1= new Radio();
		Liskov l= new Liskov();
		l.remote(r1);
		l.remote(r);
	
	}
}
