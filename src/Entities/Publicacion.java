/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author marti
 */
public class Publicacion 
{
    private ObjectId id;
    private String numSec;
    private String prof;
    private String titulo;
    private Revista revista;
    private Congreso congreso;

    public Publicacion() {
    }

    public Publicacion(String numSec, String titulo) {
        this.numSec = numSec;
        this.titulo = titulo;
    }

    public Publicacion(ObjectId id, String numSec, String prof, String titulo) {
        this.id = id;
        this.numSec = numSec;
        this.prof = prof;
        this.titulo = titulo;
    }

    public Publicacion(ObjectId id, String numSec, String prof, String titulo, Revista revista) {
        this.id = id;
        this.numSec = numSec;
        this.prof = prof;
        this.titulo = titulo;
        this.revista = revista;
    }

    public Publicacion(ObjectId id, String numSec, String prof, String titulo, Congreso congreso) {
        this.id = id;
        this.numSec = numSec;
        this.prof = prof;
        this.titulo = titulo;
        this.congreso = congreso;
    }

    public Publicacion(String numSec, String prof, String titulo, Revista revista) {
        this.numSec = numSec;
        this.prof = prof;
        this.titulo = titulo;
        this.revista = revista;
    }

    public Publicacion(String numSec, String prof, String titulo, Congreso congreso) {
        this.numSec = numSec;
        this.prof = prof;
        this.titulo = titulo;
        this.congreso = congreso;
    }
    
    

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNumSec() {
        return numSec;
    }

    public void setNumSec(String numSec) {
        this.numSec = numSec;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public Congreso getCongreso() {
        return congreso;
    }

    public void setCongreso(Congreso congreso) {
        this.congreso = congreso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "id=" + id + ", numSec=" + numSec + ", prof=" + prof + ", titulo=" + titulo + '}';
    }
}
