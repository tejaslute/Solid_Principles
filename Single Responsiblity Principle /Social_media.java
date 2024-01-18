class User {
    // Properties and methods related to users...
}

class Post {
    public void createPost(User u) {
        // Logic to create a post
    }

    public void showPosts(User u) {
        // Logic to display posts
    }

    public void deletePost(User u) {
        // Logic to delete a post
    }
}

class Comment {
    public void addComment(User u) {
        // Logic to add a comment
    }

    public void showComments(User u) {
        // Logic to display comments
    }

    public void deleteComment(User u) {
        // Logic to delete a comment
    }
}

class Like {
    public void likePost(User u) {
        // Logic to like a post
    }

    public void countLikes(User u) {
        // Logic to count likes
    }

    public void unlike(User u) {
        // Logic to unlike a post
    }
}

class Message {
    public void sendMessage(User sender, User receiver) {
        // Logic to send a message
    }

    public void seeMessages(User u) {
        // Logic to display messages
    }
}

public class SocialMedia {
    private User user;
    private Like like;
    private Comment comment;
    private Post post;
    private Message message;

    SocialMedia() {
        user = new User();
        like = new Like();
        comment = new Comment();
        post = new Post();
        message = new Message();
    }

    // Methods related to likes
    public void showLikes(User u) {
        like.countLikes(u);
    }

    // Methods related to posts
    public void createPost(User u) {
        post.createPost(u);
    }

    // Methods related to users
    public void deleteUser(User u) {
        user.deleteUser(u);
    }

    // Methods related to messages
    public void sendMessage(User sender, User receiver) {
        message.sendMessage(sender, receiver);
    }

    public static void main(String[] args) {
        User u = new User();
        SocialMedia s = new SocialMedia();
        s.showLikes(u);
        s.createPost(u);
        s.deleteUser(u);
        s.sendMessage(u, new User());
    }
}
