package dev.hotel.web;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.hotel.entite.Client;
import dev.hotel.repository.ClientRepository;

@RestController
public class Controller {

	private ClientRepository clientRepository;

	public Controller(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}

	@RequestMapping(method = RequestMethod.GET, path = "clients")
	public List<Client> listClient(@RequestParam int start, @RequestParam int size) {
		return clientRepository.findAll(PageRequest.of(start, size)).getContent();

	}

}
