package ar.com.restfull.blog.entity;

import javax.persistence.*;

@Entity
@Table(name = "cdc_user_app")
public class UserApp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String user;
    private String pass;
    private Integer level;
    private  Integer status;

    public UserApp() {
    }

    public UserApp(Integer id, String user, String pass, Integer level, Integer status) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.level = level;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "UserApp{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", level=" + level +
                ", status=" + status +
                '}';
    }
}
