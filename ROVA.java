
/*
Notes:
- Battery Charge Rate: 1% per minute
- Battery usage at rest: 1% per hour.
- Battery usage while moving: 5% per hour.

- Max velocity of the rovers in question is 5mph

- Space per mile: 1 GB per mile
- Maximum Space: 1 TB
- Upload Time: 1 GB per minute

- Check when memory is full so it could allocate it
    called isFull()
- Check when rover is about to die so it could charge 
    called aboutToDie()
*/

class ROVA {
  private double rLatitude;
  private double rLongitude;
  private String rName;
  private double remainingBattery;
  private double remainingSpace;

  //Constructor
  public ROVA (double _RLat, double _RLong, String _RName, double _battery, double _space) {
    this.rLatitude = _RLat;
    this.rLongitude = _RLong;
    this.rName = _RName;
    this.remainingBattery = _battery;
    this.remainingSpace = _space;
  }

  //Setters
  public void setRLatitude(double _RLat) {
    this.rLatitude = _RLat;
  }

  public void setRLongitude(double _RLong) {
    this.rLongitude = _RLong;
  }

  //Getters
  public double getRLatitude() {
    return rLatitude;
  }

  public double getRLongitude() {
    return rLongitude;
  }

  //Additional fucntions
  public double batteryCharging(double charge) {
    return remainingBattery + charge;
  }

  public double spaceAllocated(double space) {
    return remainingSpace + space;
  }

  public double batteryDepletion(double charge) {
    return remainingBattery - charge;
  }

  public double atMotionSpace(double space) {
    return remainingSpace - space;
  }

  public boolean isFull() {
    return remainingSpace < 900;
    //return true if less than 900 byte
  }

  public boolean aboutToDie() {
    return remainingBattery < 0.2;
    //return true if less than 20% like a smartphone
  }

  /*
  public double[] move(String location) {
    if(location == "Nearest Wifi") {

      //Should implement an algorithm or call a function where it'll decide which location is the nearest.
      //But, for the time being, we can assume that the rover is assigned to "Ran Wifi"

      double locat[2] = {latitude, longitude};
    }
    else
    {
      double locat[2] = {latitude, longitude};
    }
    return locat;
  }*/
}