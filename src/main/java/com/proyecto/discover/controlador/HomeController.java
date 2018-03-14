package com.proyecto.discover.controlador;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.proyecto.discover.dao.Dao;
import com.proyecto.discover.modelo.Filtro;
import com.proyecto.discover.util.HibernateUtils;

@Controller

public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String mostrarContactos( @ModelAttribute("filtro") Filtro filtro, Model model) {
				
		model.addAttribute("listado",Dao.busquedaTodosContactos());
		return "listadoContactos";
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
