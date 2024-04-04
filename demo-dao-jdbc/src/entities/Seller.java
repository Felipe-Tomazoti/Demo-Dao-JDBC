package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Seller implements Serializable {

    private Integer id;
    private Date birthDate;
    private String name;
    private String email;
    private Double baseSalary;
    private Department department; // Seller have one department

    public Seller(){
    }
    public Seller(Integer id, Date birthDate, String name, String email, Double baseSalary, Department department) {
        this.id = id;
        this.birthDate = birthDate;
        this.name = name;
        this.email = email;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setDate(Date date) {
        this.birthDate = date;
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
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "Id: " + id +
                ", birthDate: " + birthDate +
                ", name: '" + name + '\'' +
                ", email: '" + email + '\'' +
                ", baseSalary: " + baseSalary +
                ", department: " + department +
                '}';
    }
}
