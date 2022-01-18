package no.hvl.dat102.tabell;

import no.hvl.dat102.adt.StabelADT;
import no.hvl.dat102.exception.EmptyCollectionException;

//  Tabellimplementasjon av en stabel.
//********************************************************************

public class TabellStabel<T> implements StabelADT<T> {
	private final static int STDK = 100;
	private int topp; // indikerer toppen
	private T[] stabel;

	/*******************************************************************
	 * Oppretter en tom stabel.
	 *******************************************************************/

	public TabellStabel() {
		this(STDK);
	}

	/*******************************************************************
	 * Oppretter en tom stabel med en spesifisert kapasitet.
	 *******************************************************************/
	public TabellStabel(int startKapasitet) {
		topp = -1;
		stabel = (T[]) (new Object[startKapasitet]);
	}

	/*******************************************************************
	 * Legger til det spesifiserte elementet p� toppen av stabelen, utvider
	 * kapasiteten til stabelen hvis n�dvendig.
	 *******************************************************************/
	@Override
	public void push(T element) {
		// TODO
	}

	/*******************************************************************
	 * 
	 * Fjerner toppelementet og returnereret referansen. Hvis stabelen tom fra før,
	 * kastes unntak
	 *******************************************************************/
	@Override
	public T pop() {
		// TODO

		return null;
	}

	/*******************************************************************
	 * Returnerer toppelementet uten � fjerne det. Hvis stabelen er tom fra f�r,
	 * returneres null-ref.
	 *******************************************************************/
	@Override
	public T peek() {
		if (erTom())
			throw new EmptyCollectionException("Stabel");

		// TODO
		return null;
	}

	/*******************************************************************
	 * Returnerer sann hvis stabelen er tom og usann ellers.
	 *******************************************************************/
	@Override
	public boolean erTom() {
		return (topp < 0);
	}

	/*******************************************************************
	 * Oppretter en ny tabell for � lagre innholdet.
	 *******************************************************************/
	private void utvid() {
		T[] hjelpeTabell = (T[]) (new Object[stabel.length * 2]);

		for (int indeks = 0; indeks < stabel.length; indeks++)
			hjelpeTabell[indeks] = stabel[indeks];

		stabel = hjelpeTabell;
	}
}
