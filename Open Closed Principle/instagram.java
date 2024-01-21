// Initial class representing the Instagram app
public class InstagramApp {
    public void postPhoto() {
        System.out.println("Posting a photo");
    }

    public void sendMessage() {
        System.out.println("Sending a message");
    }

    public void like() {
        System.out.println("Liking a post");
    }
}

// Extended class adding new features
public class ExtendedInstagramApp extends InstagramApp {
    public void startThread() {
        System.out.println("Starting a thread");
    }

    public void postReel() {
        System.out.println("Posting a reel");
    }

    public void applyPhotoFilter() {
        System.out.println("Applying a photo filter");
    }
}

// Example usage
public class InstagramAppExample {
    public static void main(String[] args) {
        InstagramApp initialApp = new InstagramApp();
        initialApp.postPhoto();
        initialApp.sendMessage();
        initialApp.like();

        ExtendedInstagramApp extendedApp = new ExtendedInstagramApp();
        extendedApp.postPhoto(); // Inherited functionality
        extendedApp.sendMessage(); // Inherited functionality
        extendedApp.like(); // Inherited functionality
        extendedApp.startThread(); // New functionality
        extendedApp.postReel(); // New functionality
        extendedApp.applyPhotoFilter(); // New functionality
    }
}
