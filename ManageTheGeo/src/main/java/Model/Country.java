
package Model;


public class Country extends EastAsiaCountries implements Comparable<Country>{
   private String countryTerrain;

    public Country() {
        
    }

    public Country(String countryTerrain, String countryCode, String countryName, double countryArea) {
        super(countryCode, countryName, countryArea);
        this.countryTerrain = countryTerrain;
    }
    
   @Override
    public void display () {
        System.out.printf("%-15s%-30s%-25.0f%-30s\n", this.countryCode, this.countryName, this.countryArea, this.countryTerrain);
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    
    
    
    @Override
    public int compareTo(Country o) {
       return this.getCountryName().compareTo(o.getCountryName());
    }
   
   
}
