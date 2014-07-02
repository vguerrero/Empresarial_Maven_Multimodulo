package org.vmgs.appempresarial.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Size;
//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;

@Entity
@Table(name = "producto")
/*
@NamedQueries({
@NamedQuery(name=Contact.FIND_ALL, query="SELECT p FROM Contact p"), //estas consultas estaticas son eficientes
@NamedQuery(name=Contact.FIND_ByEmail, query="SELECT p FROM Contact p where p.email = ?1")
})*/
public class Producto {
	
	//public static final String FIND_ALL = "Contact.findAll"; 
	//public static final String FIND_ByEmail="Contact.findByEmail";
	
	/*id 
	nombre 
	precio
	categoria --> todavia no
	cantbod*/

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nombre")
	//@Size(min=2, max=30) 
	private String nombre;

	@Column(name = "precio")
	private float precio;

	@Column(name = "cantbod")
	//@Email
	//@NotEmpty
	private int cantbod;

	
	
	/*@OneToOne(fetch=FetchType.EAGER) //LAZY lectura demorada // optional=false--> no nulos
	@JoinColumn(name="Category_FK")
	private Category category;*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public int getCantbod() {
		return cantbod;
	}


	public void setCantbod(int cant) {
		this.cantbod = cant;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}

}
