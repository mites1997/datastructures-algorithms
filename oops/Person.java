package oops;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {

        this.age = age >= 0 && age <= 100 ? age : 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public boolean isTeen(int age) {
        return age > 12 || age < 20 ? true : false;
    }
    public String getFullName(String firstName,String lastName)
    {
        String fullName="";
        if(firstName.isEmpty()&&!lastName.isEmpty())
        {
            return lastName;
        }
        if(!firstName.isEmpty()&&lastName.isEmpty())
        {
            return firstName;
        }
        return fullName;
    }
}
