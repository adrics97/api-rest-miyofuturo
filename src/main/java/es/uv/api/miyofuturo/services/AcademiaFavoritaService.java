package es.uv.api.miyofuturo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.uv.api.miyofuturo.entities.AcademiaFavorita;
import es.uv.api.miyofuturo.entities.Usuario;
import es.uv.api.miyofuturo.entities.Ids.AcademiaFavoritaId;
import es.uv.api.miyofuturo.repositories.AcademiaFavoritaRepository;
import es.uv.api.miyofuturo.repositories.CarrerasFavoritasRepository;
import es.uv.api.miyofuturo.repositories.UsuariosRepository;

@Service
public class AcademiaFavoritaService {


	@Autowired
	private AcademiaFavoritaRepository acaFavRepo;
	
	@Autowired
	private UsuariosRepository usuariosRepo;
	
	public List<AcademiaFavorita> getAcademiasFavoritasByUser(int idusuario) {
		Usuario u = usuariosRepo.findById(idusuario).orElse(null);
		return acaFavRepo.findByIdusuario(u);
	}

	public AcademiaFavorita getAcademiaFavorita(int idacademia, int idusuario) {
		AcademiaFavoritaId acaFavId = new AcademiaFavoritaId(idacademia,idusuario);
		return acaFavRepo.findById(acaFavId).orElse(null);
	}

	public AcademiaFavorita createAcademiaFavorita(AcademiaFavorita acaFav) {
		return acaFavRepo.save(acaFav);
	}

	public void deleteAcademiaFavorita(int idacademia, int idusuario) {
		AcademiaFavoritaId acaFavId = new AcademiaFavoritaId(idacademia,idusuario);
		acaFavRepo.deleteById(acaFavId);
		
	}

}
