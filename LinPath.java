import java.util.PriorityQueue;
import java.util.Iterator;

class LinPath implements Comparable<LinPath>{
  private double latitude;
  private double longitude;
  private String stationName;
  private double edge;

  //Constructor
  public LinPath(double _lat, double _long, String _name, double edge) {
    this.latitude = _lat;
    this.longitude = _long;
    this.stationName = _name;
    this.edge = 0.00;
  }

  //Setter
  public void setLatitude(double _lat) {
    this.latitude = _lat;
  }

  public void setLongitude(double _long) {
    this.longitude = _long;
  }

  public void setStationName(String _name) {
    this.stationName = _name;
  }

  public void setEdge(double _edge) {
    this.edge = _edge;
  }

  //Getter
  public double getLatitude() {
    return latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public String getStationName() {
    return stationName;
  }

  public double getEdge() {
    return edge;
  }

  //print function and great when priority queue with ROVA and egdes are random
  public String toString() {
    return stationName + " is the closest location";
  }

  //Operator overload for the priority queue
  @Override
  public int compareTo(LinPath station) {
    if(this.edge > station.edge)
    {
      return 1;
    }
    else if (this.edge < station.edge)
    {
      return -1;
    }
    else
    {
      return 0;
    }
  }
}