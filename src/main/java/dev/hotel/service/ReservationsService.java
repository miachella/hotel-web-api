package dev.hotel.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.hotel.entite.Chambre;
import dev.hotel.entite.Client;
import dev.hotel.entite.Reservation;
import dev.hotel.repository.ReservationsRepository;

@Service
public class ReservationsService {

	private ReservationsRepository resaRepo;

	public ReservationsService(ReservationsRepository resaRepo) {
		super();
		this.resaRepo = resaRepo;
	}

	public List<Reservation> listerReservations(int numeroPage, int taille) {

		return resaRepo.findAll(PageRequest.of(numeroPage, taille)).getContent();
	}

	@Transactional
	public Reservation creerNouvelleReservation(LocalDate dateDebut, LocalDate dateFin, Client client,
			List<Chambre> chambres) {
		Reservation nouvelleResa = new Reservation(dateDebut, dateFin, client, chambres);
		return resaRepo.save(nouvelleResa);
	}

}
