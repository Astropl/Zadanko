package SDA;

public class toyotaGroup extends Car implements carFactory{
    private String brandName;

    public toyotaGroup( String brandName)
    {//super(brandName);
        this.brandName = brandName;
    }

    /*public toyotaGroup () {
        super ();

    }*/

    @Override
    public void modify () {

    }
}
