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
	 * Legger til det spesifiserte elementet på toppen av stabelen, utvider
	 * kapasiteten til stabelen hvis nødvendig.
	 *******************************************************************/
	@Override
	public void push(T element) {
		topp++;
		stabel[topp] = element;
	}

	/*******************************************************************
	 * 
	 * Fjerner toppelementet og returnereret referansen. Hvis stabelen tom fra før,
	 * kastes unntak
	 *******************************************************************/
	@Override
	public T pop() {
		T pop = peek();
		stabel[topp] = null;
		topp--;
		return pop;
	}

	/*******************************************************************
	 * Returnerer toppelementet uten å fjerne det. Hvis stabelen er tom fra før,
	 * returneres null-ref.
	 *******************************************************************/
	@Override
	public T peek() {
		if (erTom())
			throw new EmptyCollectionException("Stabel");
		return stabel[topp];
	}

	/*******************************************************************
	 * Returnerer sann hvis stabelen er tom og usann ellers.
	 *******************************************************************/
	@Override
	public boolean erTom() {
		return (topp < 0);
	}

	/*******************************************************************
	 * Oppretter en ny tabell for å lagre innholdet.
	 *******************************************************************/
	private void utvid() {
		@SuppressWarnings("unchecked")
		T[] hjelpeTabell = (T[]) (new Object[stabel.length * 2]);

		for (int i = 0; i < stabel.length; i++)
			hjelpeTabell[i] = stabel[i];

		stabel = hjelpeTabell;
	}
}
