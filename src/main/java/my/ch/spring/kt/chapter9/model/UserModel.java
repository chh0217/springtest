package my.ch.spring.kt.chapter9.model;

/**
 * @author chenh
 * @date 2017/12/26.
 */
public class UserModel {
    private int id;
    private String name;
    private AddressModel address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddressModel getAddress() {
        return address;
    }

    public void setAddress(AddressModel address) {
        this.address = address;
    }
}
