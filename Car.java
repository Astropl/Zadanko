package SDA;

public class Car implements carFactory
{
    private String model = "Model 09";
    private String color = "Niebieski";
    private long vin = 12345678;
    private Engine engine;
    private String brandName = "Jakies auto";

    /*public Car ( String brandName ) {

        this.brandName = brandName;
    }*/
    /*public Car(String brandName)
    {
        this.brandName = brandName;
        System.out.println (brandName);
    }*/

    /*public Car () {

    }*/

    public String getmodel () {
        return model;
    }
    public void  setModel ( String model)
    {
        this.model = model;
        return;
    }

    public String getColor () {
        return color;
    }
    public void setColor( String color)
    {
        this.color = color;
        return;
    }

    public long getVin () {
        return vin;
    }

    public void setVin ( long vin ) {
        this.vin = vin;
        return;
    }

    public Engine getEngine () {
        return engine;
    }

    public void setEngine ( Engine engine ) {
        this.engine = engine;
        return;
    }

    public String getBrandName () {

        return brandName;
    }

    public void setBrandName ( String brandName ) {
        this.brandName = brandName;
        return;
    }


    @Override
    public void modify () {

    }
}
