package kg.hometask.classCykinder;
import kg.hometask.interfaceCylinders.MathInterf;

import java.lang.Math;

public class GeoMetry implements MathInterf {

    private int baseRange;
    private int height;
    private double Pi = Math.PI;

    public int getBaseRange() {
        return baseRange;
    }

    public void setBaseRange(int baseRange) {
        this.baseRange = baseRange;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getPi() {
        return Pi;
    }

    public GeoMetry(int baseRange, int height, double pi) {
        this.baseRange = baseRange;
        this.height = height;
        Pi = pi;
    }

    public double capacityOfCylinder() throws NegativeValueException {

            double displacement = (getPi() * (getBaseRange() * getBaseRange()) * getHeight());
        System.out.println(displacement);
            if (baseRange < 0) {

                throw new NegativeValueException("BaseRange is <0, it should be > 0 :  "  + " "+" base range is "+ getBaseRange()+ ", " +" height is "+ getHeight());
            }
            return (getPi() * (getBaseRange() * getBaseRange()) * getHeight());
        }
        }









