package guru.springframework.springpetclinic.services.map;

import com.sun.xml.bind.v2.model.core.ID;
import guru.springframework.springpetclinic.model.Owner;
import guru.springframework.springpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public void delete(Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
