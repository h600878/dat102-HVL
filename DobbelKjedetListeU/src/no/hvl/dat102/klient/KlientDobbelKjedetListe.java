package no.hvl.dat102.klient;

import no.hvl.dat102.kjedet.DobbelKjedetOrdnetListe;

public class KlientDobbelKjedetListe {

	public static void main(String[] args) {
		String ord[] = { "o", "a", "s", "m", "e", "k", "c" };

		DobbelKjedetOrdnetListe<String> liste = new DobbelKjedetOrdnetListe(new String("AAA"), new String("zzz"));
		// Klienten bør sjekke på at alle verdier ligger innenfor grensene
		// Legger data inn i listen
		for (int i = 0; i < ord.length; i++) {
			liste.leggTil(ord[i]);

		}
		// Utskrift foran
		System.out.println(liste);

		// Utskrift bak
		 System.out.println(liste.tilStrengBaklengs());

		// Slette
		if (!liste.erTom()) {
			liste.fjern("m");// midt inni
		}
		if (!liste.erTom()) {
			liste.fjern("a");// foerste
		}
		if (!liste.erTom()) {
			liste.fjern("s");// siste
		}

		// Utskrift etter sletting
		System.out.println(liste);

		// Forsøk på å slette t som ikke fins
		if (!liste.erTom()) {
			liste.fjern("t");
		}
		System.out.println(liste);

	}

}
