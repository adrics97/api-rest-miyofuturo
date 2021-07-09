package es.uv.api.miyofuturo.services;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.Evento;
import es.uv.api.miyofuturo.repositories.EventosRepository;

@Service
public class EventosService {
	
	@Autowired
	private EventosRepository eventosRepository;

	public List<Evento> getAllEventos() {
		return eventosRepository.findAll();
	}

	public Evento getEvento(int idevento) {	
		return eventosRepository.findById(idevento).orElse(null);
	}

	public List<Evento> getEventosByCity(String ciudad) {
		return eventosRepository.findByCiudad(ciudad);
	}

	public List<Evento> getEventosCercanos() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		String hoy = dateFormat.format(c.getTime());
		System.out.println(hoy);
		Date today = Date.valueOf(hoy);
		c.add(Calendar.DAY_OF_MONTH, 30);
		String d = dateFormat.format(c.getTime());
		System.out.println(d);
		Date more = java.sql.Date.valueOf(d);
		List<Evento> cercanos = eventosRepository.findEventosCercanos(today,more);
		return cercanos;
	}


}
