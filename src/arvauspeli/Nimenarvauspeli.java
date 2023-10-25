package arvauspeli;

import java.util.Scanner;

public class Nimenarvauspeli {
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Tervettuloa arvauspeliin!");
        System.out.println("Arvaa nimeni");
        // oikea nimi
        String correctName = "Ella";
        // käyttäjä input
        String guess = "";


        do {
            
            guess = in.nextLine();
            //oikea nimi
            if (guess.equalsIgnoreCase(correctName)) {

                System.out.println("Onneksi olkoon! Arvasit oikein");
                //tyhjä vastaus
            } else if (guess.equals("")) {
                System.out.println("Puhu kovempaa! En kuule!");
            }
            //lopetus
            else if (guess.equals("lopeta")) {
            	break;
            }
            //väärin arvaus
             else {
                System.out.println("Yritä uudestaan!");
            }
        } while (!guess.equalsIgnoreCase(correctName));

    }

}
