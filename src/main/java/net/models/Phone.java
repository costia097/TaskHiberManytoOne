package net.models;

import javax.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {
    private int idphone;
    private Integer number;
    private Person person;

    public Phone() {
    }

    public Phone(Integer number) {
        this.number = number;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdphone() {
        return idphone;
    }

    public void setIdphone(int idphone) {
        this.idphone = idphone;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    @ManyToOne
    @JoinColumn(name = "idphone", updatable = false, insertable = false)
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (idphone != phone.idphone) return false;
        if (number != null ? !number.equals(phone.number) : phone.number != null) return false;
        return person != null ? person.equals(phone.person) : phone.person == null;
    }

    @Override
    public int hashCode() {
        int result = idphone;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (person != null ? person.hashCode() : 0);
        return result;
    }
}
