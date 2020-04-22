package ar.com.restfull.blog.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "cdc_noticias")
public class Noticia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String descripcion;

    @Temporal(value = TemporalType.DATE)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date fecha_creado;

    @Temporal(value = TemporalType.TIME)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date hora_creado;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user",referencedColumnName = "id_user")
    Users users;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_categoria",referencedColumnName = "id")
    Categoria categoria;


    public Noticia() {
    }

    public Noticia(Integer id, String titulo, String descripcion, Date fecha_creado, Date hora_creado, Users users, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_creado = fecha_creado;
        this.hora_creado = hora_creado;
        this.users = users;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_creado() {
        return fecha_creado;
    }

    public void setFecha_creado(Date fecha_creado) {
        this.fecha_creado = fecha_creado;
    }

    public Date getHora_creado() {
        return hora_creado;
    }

    public void setHora_creado(Date hora_creado) {
        this.hora_creado = hora_creado;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Noticia{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha_creado=" + fecha_creado +
                ", hora_creado=" + hora_creado +
                ", users=" + users +
                ", categoria=" + categoria +
                '}';
    }
}
