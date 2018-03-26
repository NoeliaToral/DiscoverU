package com.proyecto.discover.controlador;

import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.discover.dao.Dao;





@Controller

public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String mostrarContactos() {
				
		
		return "home";
	}
	
	@RequestMapping("/listar")
	public String mostrarContactos(Model model) {
				
		model.addAttribute("listado",Dao.busquedaTodosContactos());
		return "listadoContactos";
	}
	
	@RequestMapping(value="/insertar",method = RequestMethod.GET)
	public String insertar(HttpServletRequest req){
		
		return "insertarProductos";
	}
	
	@RequestMapping(value="/insertarProductos",method = RequestMethod.POST)
	public String insertarProductos(HttpServletRequest req){
				
		String nombre = req.getParameter("nombre");
		String descripcion = req.getParameter("descripcion");
		String precio = req.getParameter("precio");
		String url = req.getParameter("url");
		String talla = req.getParameter("talla");
		String material = req.getParameter("material");
		double precioD = Double.parseDouble(precio);
		Dao.insertarProductos(nombre, descripcion, precioD, url, talla, material);
		
		return "insertadoOK";
	}
//	@RequestMapping(value="/listadoContactos",method = RequestMethod.POST)
//	public String mostrarContactosOrdenados(Filtro filtro,Model model) {
//				
//		model.addAttribute("listado",Dao.busquedaOrdenada(filtro.getSeleccion()));
//		return "listadoContactos";
//	}
	

//	@RequestMapping(value="/datosContacto")
//	public String mostrarContacto(@RequestParam int idPersona,Model model){
//		model.addAttribute("persona",Dao.busquedaContacto(idPersona));
//		return "datosContacto";
//	}
	
}
