import java.util.PriorityQueue;
import java.util.Iterator;

class Main {
  public static void main(String[] args)
  {
    //Initialize the priority queue
    PriorityQueue<LinPath> Stations = new PriorityQueue<>();
    
    //Assume that each edge will be a brother of the first station
    //EX: edge, edge+5.5, edge+10.4
    double edge = 6.1;

    //Create the priority queue
    Stations.add(new LinPath(-24.1480693, 130.3364041, "Charlie Wifi", edge));
    
    edge += 5.5;
    Stations.add(new LinPath(-24.1480692, 130.3364044, "Delta Power", edge));

    edge += 10.4;
    Stations.add(new LinPath(-24.1480694, 130.3364042, "Ran Wifi", edge));


    //Since there are edges that are create brute-forced,
    //"Charlie Wifi" should be the front of the queue
    System.out.println(Stations.peek());

    //ROVA is initialized and its functions are called
    ROVA starship = new ROVA(-24.1480593,130.3364041, "ROOMBA", 0.20, 850.00);
    
    if(starship.isFull()) {
      //ROVA.move("Nearest Wifi");
      return;
    }
    if(starship.aboutToDie()) {
      //ROVA.move("Delta Power")
      return;
    }
  }
}