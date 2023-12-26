export class Booking {
    bookingId: number;
  date!: Date;
  status!: string;
  source: string;
  destination: string;
  departure: Date;
  arrival: Date;
  static booking_id: string;

  constructor(
    bookingId: number,
  date: Date,
  source: string,
  destination: string,
  departure: Date,
  arrival: Date,
  )

  {
      this.bookingId = bookingId;
      this.departure = departure;
      this.arrival = arrival;
      this.source = source;
      this.destination = destination;



    }

}
