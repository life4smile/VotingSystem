package ru.l4s.votingsystem.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "likes", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "date_time"}, name = "likes_unique_user_datetime_idx")})
public class Like extends BaseEntity{

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    private Restaurant restaurant;

    @Column(name = "date_time", nullable = false)
    @NotNull
    private LocalDateTime localDateTime;

    public Like(Integer id, User user, Restaurant restaurant, LocalDateTime localDateTime) {
        super(id);
        this.user = user;
        this.restaurant = restaurant;
        this.localDateTime = localDateTime;
    }

    public User getUser() {
        return user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + getId() +
                ", user=" + user +
                ", restaurant=" + restaurant +
                ", localDateTime=" + localDateTime +
                '}';
    }
}
