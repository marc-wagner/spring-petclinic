package guru.springframework.springpetclinic.services.map;

import com.sun.xml.bind.v2.model.core.ID;
import guru.springframework.springpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap<Pet, Long> extends AbstractService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
