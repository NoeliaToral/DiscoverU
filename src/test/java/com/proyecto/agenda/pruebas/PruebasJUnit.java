//package com.proyecto.agenda.pruebas;
//
//
//
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
//import org.hibernate.Query;
//import org.hibernate.Session;
//import org.junit.AfterClass;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.assertTrue;
//
//import java.util.List;
//
//import com.proyecto.agenda.dao.Dao;
//import com.proyecto.agenda.modelo.Empleados;
//import com.proyecto.agenda.modelo.Personas;
//import com.proyecto.agenda.util.HibernateUtils;
//
//
//
//
//public class PruebasJUnit {
//	
//	private static byte cont = 1;
//	private static Logger logger;
//	private String nombre="nombre";
//	private String apellido1="apellido1";
//	private String apellido2="apellido2";
//	private List<Personas> contactos;
//	
//	
//	
//	static {
//		try {
//			logger = LogManager.getLogger(PruebasJUnit.class);
//		} catch (Throwable e) {
//			System.out.println("Don't work");
//		}
//	}
//	
//	@BeforeClass
//	public static void onceExecutedBeforeAll() {
//		logger.info(">>> Iniciando las pruebas");
//	}
//
//	@Before
//	public void executedBeforeEach() {
//		System.out.println("");
//		logger.info("=== PRUEBA "+(cont++)+" ======");
//	}
//
//	@AfterClass
//	public static void onceExecutedAfterAll() {
//		logger.info(">>> Terminado las pruebas");
//	}
//
//	/*
//	@Test
//	public void testBusquedaOrdenadaNombre(){
//		logger.warn("Error, lista vacia");
//		Session session = HibernateUtils.getSession();
//		Query query = session.createQuery("FROM Personas ORDER BY " +nombre+ " asc");
//		contactos = query.list();
//		session.close();
//		for(Personas persona : contactos){
//			assertTrue(persona.getNombre() != null);
//		}
//		
//	}
//	
//	@Test
//	public void testBusquedaOrdenadaApellido1(){
//		logger.warn("Error, lista vacia");
//		Session session = HibernateUtils.getSession();
//		Query query = session.createQuery("FROM Personas ORDER BY " +apellido1+ " asc");
//		contactos = query.list();
//		session.close();
//		for(Personas persona : contactos){
//			assertTrue(persona.getApellido1() != null);
//		}
//		
//	
//	}
//	
//	@Test
//	public void testBusquedaOrdenadaApellido2(){
//		logger.warn("Error, lista vacia");
//		Session session = HibernateUtils.getSession();
//		Query query = session.createQuery("FROM Personas ORDER BY " +apellido2+ " asc");
//		contactos = query.list();
//		session.close();
//		for(Personas persona : contactos){
//			assertTrue(persona.getApellido2() != null);
//		}
//		
//	}
//	*/
//	@SuppressWarnings("unchecked")
//	@Test
//	public void testBusquedaCompleto(){
//		logger.warn("Error, lista vacia");
//		List<Personas> porApellido2=Dao.busquedaOrdenada(apellido2);
//		List<Personas> porApellido1=Dao.busquedaOrdenada(apellido1);
//		List<Personas> porNombre=Dao.busquedaOrdenada(nombre);
//		
//		for(Personas persona : porApellido2){
//			assertTrue(persona.getApellido2() != null);
//		}
//		for(Personas persona : porApellido1){
//			assertTrue(persona.getApellido1() != null);
//		}
//		for(Personas persona : porNombre){
//			assertTrue(persona.getNombre() != null);
//		}
//		
//		
//	}
//	
//	
//
//}
