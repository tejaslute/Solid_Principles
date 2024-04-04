package staticProject;
import java.util.*;
import java.lang.*;


class Users{
	public void addUser() {
		System.out.println("User added Sucesssfuly ");
	}
	
	public void deleteUser() {
		System.out.println("User deleted Sucessfully ");
	}
}

class Auth{
	public void validate() {
		System.out.println("USer is authicated Sucessfully ");
	}
}

class Products{
	public void addProduct() {
		System.out.println("Product Added Sucessfully ");
	}
	
	public void countProduct() {
		System.out.println("Product counted ");
	}
}

class RatingAndReviews{
	public void addReview() {
		System.out.println("Review added sucessfully ");
	}
	
	public void deleteReview() {
		System.out.println("Review Deleted Scuessfully ");
	}
}


class Amazon{
	public Users users;
	public Auth auth ;
	public Products products;
	public RatingAndReviews ratingandreviews;
	
	Amazon(Users users , Auth auth , Products products , RatingAndReviews ratingandreviews){
		this.users=users;
		this.auth=auth;
		this.products=products;
		this.ratingandreviews=ratingandreviews;
	}
	
	public void addUser() {
		users.addUser();
	}
	
	public void deleteUser() {
		users.deleteUser();
	}
	
	public void addproduct() {
		products.addProduct();
	}
	public void rateProduct() {
		ratingandreviews.addReview();
	}
}

public class Queue{
	
	public static void main(String args[]) {
		 Users users =new Users();
		 Auth auth  = new Auth();
		Products products = new Products();
		RatingAndReviews ratingandreviews= new RatingAndReviews();
		
		Amazon a = new Amazon(users,auth,products,ratingandreviews);
		a.addUser();
		a.addproduct();
		a.rateProduct();
		a.deleteUser();
		
		
	}
}
