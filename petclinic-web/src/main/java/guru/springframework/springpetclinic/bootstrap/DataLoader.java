package guru.springframework.springpetclinic.bootstrap;

import guru.springframework.springpetclinic.model.Owner;
import guru.springframework.springpetclinic.model.Vet;
import guru.springframework.springpetclinic.services.OwnerService;
import guru.springframework.springpetclinic.services.VetService;
import guru.springframework.springpetclinic.services.map.OwnerServiceMap;
import guru.springframework.springpetclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class DataLoader implements CommandLineRunner {


	private final OwnerService ownerService;
	private final VetService vetService;

/* leaving this noarg constructor in gave me grievance no end,
as it would instanciate a new blank dataloader instead of the DI handle
public DataLoader() {
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap();

	}
*/

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		 Owner owner1 = new Owner();
		 owner1.setFirstName("Michael");
		 owner1.setLastName("Weston");
		 ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		ownerService.save(owner2);

		System.out.println("Loaded Owners");
		System.out.println(ownerService.findAll().size());


		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vetService.save(vet1);

		Vet vet2 = new Vet();
		vet2.setFirstName("Benjamin");
		vet2.setLastName("Dover");
		vetService.save(vet2);

		System.out.println("Loaded Vets");

	}
}
