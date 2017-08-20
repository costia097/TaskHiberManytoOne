package net.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "person")
public class Person {
    private int idPerson;

    private Set<Phone> getPhone = new HashSet<Phone>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
    public Set<Phone> getGetPhone() {
        return getPhone;
    }

    public void setGetPhone(Set<Phone> getPhone) {
        this.getPhone = getPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (idPerson != person.idPerson) return false;
        return getPhone != null ? getPhone.equals(person.getPhone) : person.getPhone == null;
    }

    @Override
    public int hashCode() {
        int result = idPerson;
        result = 31 * result + (getPhone != null ? getPhone.hashCode() : 0);
        return result;
    }
}
