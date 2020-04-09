package ar.com.restfull.blog.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cdc_comentario")
public class Comentario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nm_comentario;

    @Temporal(value = TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fecha;

    @Temporal(value = TemporalType.TIME)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date hora;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user",referencedColumnName = "id_user")
    Users users;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_noticia",referencedColumnName = "id")
    Noticia noticia;

    public Comentario() {
    }

    public Comentario(Integer id, String nm_comentario, Date fecha, Date hora, Users users, Noticia noticia) {
        this.id = id;
        this.nm_comentario = nm_comentario;
        this.fecha = fecha;
        this.hora = hora;
        this.users = users;
        this.noticia = noticia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNm_comentario() {
        return nm_comentario;
    }

    public void setNm_comentario(String nm_comentario) {
        this.nm_comentario = nm_comentario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Noticia getNoticia() {
        return noticia;
    }

    public void setNoticia(Noticia noticia) {
        this.noticia = noticia;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", nm_comentario='" + nm_comentario + '\'' +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", users=" + users +
                ", noticia=" + noticia +
                '}';
    }
}
