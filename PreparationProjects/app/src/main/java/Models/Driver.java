public class Driver {

    String LicensePlate;
    String DriverName;
    String DriverCellNumber;
    String DriverHomeAddress;
    int VehiclePassangerLimit;

    public Driver(String licensePlate,String driverName,String driverCellNumber,String driverHomeAddress,int vehiclePassangerCount) {
        LicensePlate = licensePlate;
        DriverName = driverName;
        DriverCellNumber = driverCellNumber;
        DriverHomeAddress = driverHomeAddress;
        VehiclePassangerLimit = vehiclePassangerCount;
    }

    public int getVehiclePassangerLimit() {
        return VehiclePassangerLimit;
    }

    public void setVehiclePassangerLimit(int vehiclePassangerCount) {
        VehiclePassangerLimit = vehiclePassangerCount;
    }

    public String getDriverHomeAddress() {
        return DriverHomeAddress;
    }

    public void setDriverHomeAddress(String driverHomeAddress) {
        this.DriverHomeAddress = driverHomeAddress;
    }

    public String getDriverCellNumber() {
        return DriverCellNumber;
    }

    public void setDriverCellNumber(String driverCellNumber) {
        DriverCellNumber = driverCellNumber;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        LicensePlate = licensePlate;
    }
}
