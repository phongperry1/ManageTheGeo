
import Controller.ManageEastAsiaCountries;
import Model.Country;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Country> lc = new ArrayList<>();
        ManageEastAsiaCountries meac = new ManageEastAsiaCountries();
        while(true) {
            int choice = meac.menu();
            switch (choice) {
                case 1:
                    meac.inputCountry(lc);
                    break;
                case 2:
                    meac.printCountry(lc);
                    break;
                case 3:
                    meac.searchByName(lc);
                    break;
                case 4:
                    meac.printCountrySorted(lc);
                    break;
                case 5:
                    return;
                
            }
        }
                 
    }
}
