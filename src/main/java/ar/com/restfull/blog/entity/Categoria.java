package ar.com.restfull.blog.entity;

import javax.persistence.*;

@Entity
@Table(name = "cdc_categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nm_categoria;

    public Categoria() {
    }

    public Categoria(Integer id, String nm_categoria) {
        this.id = id;
        this.nm_categoria = nm_categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNm_categoria() {
        return nm_categoria;
    }

    public void setNm_categoria(String nm_categoria) {
        this.nm_categoria = nm_categoria;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nm_categoria='" + nm_categoria + '\'' +
                '}';
    }
}
