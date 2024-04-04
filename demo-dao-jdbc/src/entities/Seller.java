package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private Integer Id;
    private Date date;
    private String name;
    private String email;
    private Double baseSalary;
    private Department department; // Seller have one department

    public Seller(){
    }
    public Seller(Integer id, Date date, String name, String email, Double baseSalary, Department department) {
        Id = id;
        this.date = date;
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(Id, seller.Id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "Id: " + Id +
                ", date: " + date +
                ", name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ", baseSalary: " + baseSalary +
                ", department: " + department +
                '}';
    }
}
