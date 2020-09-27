import java.util.Scanner;
 
public class HowFarAway
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       double lat1;//the starting latitude
       double long1;//the starting longitude
       double lat2;//the ending latitude
       double long2;//the ending longitude
 
       //asks and inputs lats and longs from user
       System.out.print("Enter the latitude of the starting location: ");
       lat1 = in.nextDouble();//gets lat1
       System.out.print("Enter the longitude of the starting location: ");
       long1 = in.nextDouble();//gets long1
       System.out.print("Enter the latitude of the ending location: ");
       lat2 = in.nextDouble();//gets lat2
       System.out.print("Enter the longitude of the ending location: ");
       long2 = in.nextDouble();//gets long2
 
       //creating GeoLocation classes
       GeoLocation geoStart = new GeoLocation(lat1, long1);//class for starting points
       GeoLocation geoAfter = new GeoLocation(lat2, long2);//class for ending points
 
       //prints distance
       System.out.print("The distance is " + geoStart.distanceFrom(geoAfter) + (" miles"));
   }
}
