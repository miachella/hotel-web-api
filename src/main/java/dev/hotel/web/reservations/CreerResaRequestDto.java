package dev.hotel.web.reservations;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dev.hotel.entite.Chambre;
import dev.hotel.entite.Client;

public class CreerResaRequestDto {

	private LocalDate dateDebut;
	private LocalDate dateFin;
	private Client client;
	private List<Chambre> chambres = new ArrayList<>();

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(List<Chambre> chambres) {
		this.chambres = chambres;
	}

}
