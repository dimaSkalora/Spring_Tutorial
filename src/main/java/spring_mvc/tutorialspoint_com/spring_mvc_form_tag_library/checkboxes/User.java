package spring_mvc.tutorialspoint_com.spring_mvc_form_tag_library.checkboxes;

public class User {
    private String username;
    private String password;
    private String address;
    private boolean receivePaper;
    private String [] favoriteFrameworks;

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
    public String[] getFavoriteFrameworks() {
        return favoriteFrameworks;
    }
    public void setFavoriteFrameworks(String[] favoriteFrameworks) {
        this.favoriteFrameworks = favoriteFrameworks;
    }
}
