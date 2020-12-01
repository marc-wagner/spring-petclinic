package guru.springframework.springpetclinic.services;

import guru.springframework.springpetclinic.model.Owner;
import org.springframework.stereotype.Service;

@Service
public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

}
