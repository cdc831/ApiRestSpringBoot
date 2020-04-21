package ar.com.restfull.blog.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cdc_user")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer id;
    private String name;
    private String last_name;
    private String email;

    @JoinColumn(name = "id_user_app",referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    private UserApp userApp;

    public Users() {
    }

    public Users(Integer id, String name, String last_name, String email, UserApp userApp) {
        this.id = id;
        this.name = name;
        this.last_name = last_name;
        this.email = email;
        this.userApp = userApp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserApp getUserApp() {
        return userApp;
    }

    public void setUserApp(UserApp userApp) {
        this.userApp = userApp;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", userApp=" + userApp +
                '}';
    }
}
