package com.proyecto.discover.dao;
import com.proyecto.discover.modelo.Productos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



import com.proyecto.discover.util.HibernateUtils;

public class Dao {

	private static List productos;
	static Query query;

	static Session session = HibernateUtils.getSession();
	
	public static List busquedaOrdenada(String orden){
		Session session = HibernateUtils.getSession();
		Query query = session.createQuery("FROM Personas ORDER BY " +orden+ " asc");
		productos = query.list();
		session.close();
		return productos;
	}
	
	public static List busquedaTodosContactos(){
		query = session.createQuery("FROM Productos");
		productos = query.list();
		session.close(); 
		return productos;
	}
	
	public static void insertarProductos(String nombreProducto, String descripcion, double precio, String url, String talla, String material) {

		Productos prod = new Productos();
		
		prod.setNombreProducto(nombreProducto);
		prod.setDescripcion(descripcion);
		prod.setPrecio(precio);
		prod.setUrl(url);
		prod.setTalla(talla);
		prod.setMaterial(material);
		session.beginTransaction();
		session.save(prod);
		session.getTransaction().commit();
		session.close();
        
        

		
	}
	
//	public static Personas busquedaContacto(int idPersona){
//		Session session = HibernateUtils.getSession();
//		Personas persona = (Personas) session.get(Personas.class,idPersona);
//		session.close();
//		return persona;
//	}
}
