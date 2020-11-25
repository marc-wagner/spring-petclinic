package guru.springframework.springpetclinic.services.map;

import guru.springframework.springpetclinic.model.Vet;
import guru.springframework.springpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap<T, ID> extends AbstractService<Vet, Long> implements CrudService<Vet,Long> {
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);

	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
