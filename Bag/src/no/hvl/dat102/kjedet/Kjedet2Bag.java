package no.hvl.dat102.kjedet;

import no.hvl.dat102.adt.BagADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;

public class KjedetBag<T> implements BagADT<T> {
	private int antall;
	private LinearNode<T> forste;

	public KjedetBag() {
		antall = 0;
		forste = null;
	}

	@Override
	public void leggTil(T el) {
		// TODO Auto-generated method stub

	}

	@Override
	public T fjern(T el) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean inneholder(T el) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void nullstill() {
		// TODO Auto-generated method stub

	}

	@Override
	public int antall() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean erTom() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] tilTabell() {
		// TODO Auto-generated method stub
		return null;
	}

}// class
