package spring_mvc.tutorialspoint_com.spring_mvc_form_tag_library.checkbox;

public class User {
    private String username;
    private String password;
    private String address;
    private boolean receivePaper;

   /* public User() {
        this.username = "Constructor";
        this.password = "Constructor";
        this.address = "Constructor";
        this.receivePaper = true;
    }*/

    public User() {
    }

    public User(String username, String address, boolean receivePaper) {
        this.username = username;
        this.address = address;
        this.receivePaper = receivePaper;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public boolean isReceivePaper() {
        return receivePaper;
    }
    public void setReceivePaper(boolean receivePaper) {
        this.receivePaper = receivePaper;
    }
}
