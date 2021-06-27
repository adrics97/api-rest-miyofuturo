package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.CarreraFavorita;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.CarreraFavoritaId;
import es.uv.api.miyofuturo.repositories.CarrerasFavoritasRepository;
import es.uv.api.miyofuturo.repositories.UsuariosRepository;

@Service
public class CarreraFavoritaService {

	@Autowired
	private CarrerasFavoritasRepository carFavRepo;
	
	@Autowired
	private UsuariosRepository usuariosRepo;
	
	public List<CarreraFavorita> getCarrerasFavoritasByUser(int idusuario) {
		Usuario u = usuariosRepo.findById(idusuario).orElse(null);		
		return carFavRepo.findByIdusuario(u);
	}

	public CarreraFavorita createEventoFavorito(CarreraFavorita carFav) {
		return carFavRepo.save(carFav);
	}

	public CarreraFavorita getCarreraFavorita(int idcarrera, int idusuario) {
		CarreraFavoritaId carfavId = new CarreraFavoritaId(idcarrera,idusuario);
		return carFavRepo.findById(carfavId).orElse(null);
	}

	public void deleteCarreraFavorita(int idcarrera, int idusuario) {
		CarreraFavoritaId carfavId = new CarreraFavoritaId(idcarrera,idusuario);
		carFavRepo.deleteById(carfavId);
		
	}

}
