package kg.hometask;

import kg.hometask.classCykinder.GeoMetry;
import kg.hometask.classCykinder.NegativeValueException;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws NegativeValueException {
  GeoMetry cyl1= new GeoMetry(3, 11, 3.14);
        GeoMetry cyl2= new GeoMetry(-6, 11, 3.14);
        GeoMetry cyl3= new GeoMetry(11, 11, 3.14);
        GeoMetry cyl4= new GeoMetry(-5, 11, 3.14);
        GeoMetry cyl5= new GeoMetry(22, 11, 3.14);

        List<GeoMetry> geoMetryList = new ArrayList<>();
        geoMetryList.add(cyl1);
        geoMetryList.add(cyl2);
        geoMetryList.add(cyl3);
        geoMetryList.add(cyl4);
        geoMetryList.add(cyl5);

        for (GeoMetry g: geoMetryList){
            try{
            g.capacityOfCylinder();}
            catch (NegativeValueException n){

                System.out.println("base range is "+g.getBaseRange()+",  it  should be positive ");
            }
        }



        }
    }




