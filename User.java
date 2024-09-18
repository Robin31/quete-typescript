import java.util.Date;

public class User {
    public Date birthday;
    public Integer size;
    public Address address;
    public Photo[] photos;

    public User (Date birthday, Integer size, Address address, Photo[] photos) {
        this.birthday = birthday;
        this.size = size;
        this.address = address;
        this.photos = photos;
    }
}

