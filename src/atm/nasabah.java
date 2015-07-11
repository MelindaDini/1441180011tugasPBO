package atm;

/**
 * Created by Toshiba C640 on 17-Jun-15.
 */
public class nasabah {
    private String firstName;
    private String lastName;
    private rekening account;

    public nasabah() {
    }

    public nasabah(String firstName, String lastName, rekening account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public rekening getAccount() {
        return account;
    }

    public void setAccount(rekening account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "nasabah{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
