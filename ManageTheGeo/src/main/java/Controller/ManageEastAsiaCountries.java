
package Controller;

import Model.Country;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ManageEastAsiaCountries {
    
    public int menu() {
        System.out.println("1. Input the information of 11 contries in East Area");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of contries sorted name in ascending");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = checkInputIntLimit(1, 5);
        return choice;
    }
    
    public int checkInputIntLimit(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if(result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
                
        } catch(NumberFormatException e) {
                System.err.println("Please enter input in rage: " + min + " and " + max);
                System.out.print("Enter again");
        }
    }
}
    
    public String checkInputString() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String result = sc.nextLine().trim();
            if(result.isEmpty()) {
                System.err.println("Can't Empty");
                System.out.print("Enter again");
            } else {
                return result;
            }
        }
    }
    
    
    public double checkInputDouble() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
            double result = Double.parseDouble(sc.nextLine());
            return result;
            } catch(NumberFormatException e) {
                System.err.println("Please input number double");
                System.out.print("Enter again: ");
        }
    }
}
    
    public void inputCountry(ArrayList<Country> lc) {
        System.out.print("Enter code of country: ");
        String countryCode = checkInputString();
        if(!checkCountryExist(lc, countryCode)) {
            System.err.println("Country exist");
            return;
        }
        System.out.print("Enter name of country: ");
        String countryName = checkInputString();
        System.out.print("Enter total area: ");
        double countryArea = checkInputDouble();
        System.out.print("Enter terrain of country: ");
        String countryTerrain = checkInputString();
        lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.out.println("Add successs");
    }
    
    
    public void printCountry(ArrayList<Country> lc) {
        System.out.printf("%-15s%-30s%-25s%-30s\n", "ID", "Name", "Total Area", "Terrain");
        for (Country country : lc) {
            country.display();
            
        }
    }
    
    public void printCountrySorted(ArrayList<Country> lc) {
        Collections.sort(lc);
        System.out.printf("%-15s%-30s%-25s%-30s\n", "ID", "Name", "Total Area", "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }
    
    public void searchByName(ArrayList<Country> lc) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = checkInputString();
        System.out.printf("%-15s%-30s%-25s%-30s\n", "ID", "Name", "Total Area", "Terrain");
        for (Country country : lc) {
            if(country.getCountryName().equalsIgnoreCase(countryName)) {
                country.display();
            }
        }
    }
    
    public boolean checkCountryExist(ArrayList<Country> lc , String countryCode) {
        for (Country country : lc) {
            if(country.getCountryCode().equalsIgnoreCase(countryCode)) {
               return false;
            }
        }
        return true;
    }
}
               