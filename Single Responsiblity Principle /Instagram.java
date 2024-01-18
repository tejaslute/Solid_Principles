

class posts{
	public void post(User u);
	public void showPost(User u);
	public void deletePost(User u);
}

class comments {
	
	public void comment(User u);
	public void showComments(User u );
	public void deleteComment(user u);
}

class likes{
	public void likePost(User u );
	public void countLike(user u );
	public void unLike(User u );
}

class users{
	public void Createuser();
	public void showUsers();
	public void getUser();
	public void validateuser();
	public void showFriends();
}

class messages{
	public void sendMessage();
	public void seemessage();
}
public class SocialMedia {
	
	
	users u;
	likes l;
	comments c;
	posts p ;
	
	SocialMedia(){
		u=new users();
		l=new likes();
		c=new comments();
		p=new posts();
	}
	
	// Methods of like
	public void showLike(User u ) {
		l.countLike();
	}
	.
	.
	.
	.
	
	// methods of posts 
	
	public void post(User u )
	{
		p.post(u);
	}
	.
	.
	.
	
	// methods of users 
	
	
	public void user(user u )
	{
		u.delteuser(u);
	}
	.
	.
	.
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		users u = new users();
		SocialMedia s= new SocialMedia();
		s.showLike(u);
		s.showPost(u);
		s.user(u);
	}

}
