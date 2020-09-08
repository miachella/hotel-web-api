package dev.hotel.web;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.hotel.entite.Client;
import dev.hotel.service.ClientService;

@RestController
public class ClientController {

	private ClientService clientService;

	public ClientController(ClientService clientService) {
		super();
		this.clientService = clientService;
	}

	@RequestMapping(method = RequestMethod.GET, path = "clients")
	public List<Client> listClient(@RequestParam int start, @RequestParam int size) {
		return clientService.listerClients(start, size);

	}

	@RequestMapping(method = RequestMethod.GET, path = "clients/{uuid}")
	public ResponseEntity<?> recupererClient(@PathVariable UUID uuid) {
		Optional<Client> optClient = clientService.recupererClient(uuid);

		if (optClient.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(optClient);
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Veuillez entrer un autre identifiant client");
		}

	}

}
