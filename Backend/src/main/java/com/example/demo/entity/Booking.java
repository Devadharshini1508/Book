package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Booking")
public class Booking {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="booking_id")
    private int booking_id;
	
//	@NotNull(message = "date can not be empty")
	 @Column(name="date")
    private LocalDateTime date;
	 
	@NotNull(message = "status name can not be empty")
	@Size(max = 20,message = "status name can't be more than 20 characters")
	@Size(min=2, message="status name must be more than 2 characters")
	 @Column(name="status")
	 
    private String status;
	@NotNull(message = "source name can not be empty")
	@Size(max = 20,message = "source name can't be more than 20 characters")
	@Size(min=1, message="source name must be more than 5 characters")
	 @Column(name="source")
	 
    private String source;
	@NotNull(message = "destination name can not be empty")
	@Size(max = 20,message = "destination name can't be more than 20 characters")
	@Size(min=1, message="destination name must be more than 5 characters")
	 @Column(name="destination")
	 
    private String destination;
	@NotNull(message = "departure name can not be empty")
	
	 @Column(name="departure")
	 
    private LocalDateTime departure;
	@NotNull(message = "arrival name can not be empty")
	//@FutureLocalDateTime(message = "Arrival time must be in the future")
	 @Column(name="arrival")
	 
    private LocalDateTime arrival;
 
    
	 @ManyToOne
	    @JoinColumn(name = "userid")
	    private User user;
	    
	    @ManyToOne
	    @JoinColumn(name = "bus_id") 
	    private Bus bus; 
	    
	    @ManyToOne
	    @JoinColumn(name = "trainId") 
	    private Train train; 
	    
	    @ManyToOne
	    @JoinColumn(name = "CarId") 
	    private Car car; 
	    
	    @ManyToOne
	    @JoinColumn(name = "flightId") 
	    private Flight flight; 
	    
	    public Bus getBus() {
			return bus;
		}

		public void setBus(Bus bus) {
			this.bus = bus;
		}
		
		

		public Train getTrain() {
			return train;
		}

		public void setTrain(Train train) {
			this.train = train;
		}

		public Flight getFlight() {
			return flight;
		}

		public void setFlight(Flight flight) {
			this.flight = flight;
		}

		public Car getCar() {
			return car;
		}

		public void setCar(Car car) {
			this.car = car;
		}

		public Booking()
		    {
		    	
		    }

		

		public Booking(int booking_id, LocalDateTime date,
				@NotNull(message = "status name can not be empty") @Size(max = 20, message = "status name can't be more than 20 characters") @Size(min = 2, message = "status name must be more than 2 characters") String status,
				@NotNull(message = "source name can not be empty") @Size(max = 20, message = "source name can't be more than 20 characters") @Size(min = 1, message = "source name must be more than 5 characters") String source,
				@NotNull(message = "destination name can not be empty") @Size(max = 20, message = "destination name can't be more than 20 characters") @Size(min = 1, message = "destination name must be more than 5 characters") String destination,
				@NotNull(message = "departure name can not be empty") LocalDateTime departure,
				@NotNull(message = "arrival name can not be empty") LocalDateTime arrival, User user, Bus bus,
				Train train, Car car, Flight flight) {
			super();
			this.booking_id = booking_id;
			this.date = date;
			this.status = status;
			this.source = source;
			this.destination = destination;
			this.departure = departure;
			this.arrival = arrival;
			this.user = user;
			this.bus = bus;
			this.train = train;
			this.car = car;
			this.flight = flight;
		}

		public int getBooking_id() {
			return booking_id;
		}

		public void setBooking_id(int booking_id) {
			this.booking_id = booking_id;
		}

		public LocalDateTime getDate() {
			return date;
		}

		public void setDate(LocalDateTime date) {
			this.date = date;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public LocalDateTime getDeparture() {
			return departure;
		}

		public void setDeparture(LocalDateTime departure) {
			this.departure = departure;
		}

		public LocalDateTime getArrival() {
			return arrival;
		}

		public void setArrival(LocalDateTime arrival) {
			this.arrival = arrival;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		@Override
		public String toString() {
			return "Booking [booking_id=" + booking_id + ", date=" + date + ", status=" + status + ", source=" + source
					+ ", destination=" + destination + ", departure=" + departure + ", arrival=" + arrival + ", user="
					+ user + ", bus=" + bus + ", train=" + train + ", flight=" + flight + "]";
		}

		

		

		 
		

	    
}
