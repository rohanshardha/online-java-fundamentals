package practice;

public class User {

    private String email;

    public User(String email) {
        this.email = email;        
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}

class Demo {

    public static void main(String[] args) {
        User user1 = new User("rohan@email.com");
        User user2 = new User("ryan@email.com");
    }
}
