package com.tiago.uniformdonation.school;

import com.tiago.uniformdonation.user.User;
import jakarta.persistence.*;

@Entity
@Table(name = "school_profiles")
public class SchoolProfile {

    @Id
    private Long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;

    @Column(nullable = false)
    private String schoolname;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String contactPhone;

    protected  SchoolProfile() {

    }

    public SchoolProfile(User user, String schoolname, String city, String contactPhone) {
        this.user = user;
        this.schoolname = schoolname;
        this.city = city;
        this.contactPhone = contactPhone;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public String getCity() {
        return city;
    }

    public String getContactPhone() {
        return contactPhone;
    }
}
