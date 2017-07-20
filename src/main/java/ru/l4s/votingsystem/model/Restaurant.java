package ru.l4s.votingsystem.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import java.util.concurrent.atomic.AtomicInteger;

@Entity
@Table(name = "restaurants", uniqueConstraints = {@UniqueConstraint(columnNames = {"address"}, name = "restaurants_unique_address_idx")})
public class Restaurant extends BaseEntity {

    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;

    @Column(name = "address", nullable = false)
    @NotBlank
    private String address;

    @Column(name = "count_of_votes")
    @NotNull
    private int countOfVotes;

    public Restaurant(Integer id, String name, String address) {
        super(id);
        this.name = name;
        this.address = address;
        this.countOfVotes = 0;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getCountOfVotes() {
        return countOfVotes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountOfVotes(int countOfVotes) {
        this.countOfVotes = countOfVotes;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
