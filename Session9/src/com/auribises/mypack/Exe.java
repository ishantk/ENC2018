package com.auribises.mypack;

public class Exe {

	public static void main(String[] args) {
		
		One o = new One();
		// o.pvtShow(); error
		o.defShow();
		o.protShow();
		o.pubShow();
		
		
		Two t = new Two();
		//t.pvtShow(); error
		t.defShow();
		t.protShow();
		t.pubShow();
	}

}
