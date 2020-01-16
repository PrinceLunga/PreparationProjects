public class Trip {

    String TripId;
    String DepartureTown;
    String DepartureTime;
    String DepartureDate;
    String DestinationTown;
    String DestinationDate;
    int NoOfStudentsOnTrip;
    String[] StudentList;
    String Driver;

    public Trip(String tripId,String departureTown,String departureTime,String departureDate,String destinationTown,String destinationDate,int studentsOnTrip,String driver,String[] studentList) {
        TripId = tripId;
        DepartureTown = departureTown;
        DepartureTime = departureTime;
        DepartureDate = departureDate;
        DestinationTown = destinationTown;
        DestinationDate = destinationDate;
        NoOfStudentsOnTrip = studentsOnTrip;
        Driver = driver;
        StudentList = studentList;
    }

    public String getTripId() {
        return TripId;
    }

    public void setTripId(String tripId) {
        TripId = tripId;
    }

    public String getDepartureTown() {
        return DepartureTown;
    }

    public void setDepartureTown(String departureTown) {
        DepartureTown = departureTown;
    }

    public String getDepartureTime() {
        return DepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        DepartureTime = departureTime;
    }

    public String getDepartureDate() {
        return DepartureDate;
    }

    public void setDepartureDate(String departureDate) {
        DepartureDate = departureDate;
    }

    public String getDestinationTown() {
        return DestinationTown;
    }

    public void setDestinationTown(String destinationTown) {
        DestinationTown = destinationTown;
    }

    public String getDestinationDate() {
        return DestinationDate;
    }

    public void setDestinationDate(String destinationDate) {
        DestinationDate = destinationDate;
    }

    public int getNoOfStudentsOnTrip() {
        return NoOfStudentsOnTrip;
    }

    public void setNoOfStudentsOnTrip(int noOfStudentsOnTrip) {
        NoOfStudentsOnTrip = noOfStudentsOnTrip;
    }

    public String[] getStudentList() {
        return StudentList;
    }

    public void setStudentList(String[] studentList) {
        StudentList = studentList;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        Driver = driver;
    }

}
