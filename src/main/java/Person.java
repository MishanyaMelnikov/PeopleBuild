public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public boolean hasAge() {
        if (age == 0) {
            return false;
        }

        return true;
    }

    public boolean hasAddress() {
        if (address.isEmpty()) {
            return false;
        }

        return true;
    }


    public String getName() {

        return name;
    }


    public String getSurname() {

        return surname;
    }

    public int getAge() {

        return age;
    }

    public String getAddress() {

        return address;
    }


    public void setAddress(String address) {

        this.address = address;
    }

    public void happyBirthday() {
        age++;

    }

//    public PersonBuilder newChildBuilder(String name, String surname, String address) {
//
//
//
//
//    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("name: ").append(name).append("surname: ").append(surname).append("age: ").append(age).append("address: ").append(address);
        return builder.toString();

    }



}
