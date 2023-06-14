/*
Write a program to create a class named it as Address, having member
variable plot no, at, post and required member function. Create a
tree map having key as name of a person and value as address. Insert
required key and value in the created tree map and display it.
 */

package Assignment2_B;

import java.util.*;

public class Address {

    private int plotNo;
    private String at;
    private String post;

    public Address(int plotNo, String at, String post) {
        this.plotNo = plotNo;
        this.at = at;
        this.post = post;
    }

    public int getPlotNo() {
        return plotNo;
    }

    public void setPlotNo(int plotNo) {
        this.plotNo = plotNo;
    }

    public String getAt() {
        return at;
    }

    public void setAt(String at) {
        this.at = at;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address{" +
                "plotNo=" + plotNo +
                ", at='" + at + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}

class Main {

    public static void main(String[] args) {

        // Create a TreeMap of Address type
        TreeMap<String, Address> addressTreeMap = new TreeMap<>();

        // Add elements to the TreeMap
        addressTreeMap.put("John Doe", new Address(100, "Main Street", "12345"));
        addressTreeMap.put("Jane Doe", new Address(200, "High Street", "67890"));

        // Display the TreeMap
        for (Map.Entry<String, Address> entry : addressTreeMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}


/* OUTPUT */
/*
Name: John Doe, Address: Address{plotNo=100, at='Main Street', post='12345'}
Name: Jane Doe, Address: Address{plotNo=200, at='High Street', post='67890'}
 */