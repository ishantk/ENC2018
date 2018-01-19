package com.auribises.yourpack;

import com.auribises.mypack.One;
//import com.auribises.mypack.Two;


public class Exe {

	public static void main(String[] args) {
		
		One o = new One();
		//o.pvtShow(); err
		//o.defShow(); err
		//o.protShow(); err

		o.pubShow();
	}

}
