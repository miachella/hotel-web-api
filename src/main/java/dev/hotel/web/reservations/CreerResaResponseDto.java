package dev.hotel.web.reservations;

import java.util.UUID;

import dev.hotel.entite.Reservation;

public class CreerResaResponseDto extends CreerResaRequestDto {

	private UUID uuid;

	public CreerResaResponseDto(Reservation reservation) {
		this.uuid = reservation.getUuid();
		this.setDateDebut(reservation.getDateDebut());
		this.setDateFin(reservation.getDateFin());
		this.setClient(reservation.getClient());
		this.setChambres(reservation.getChambres());
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

}
