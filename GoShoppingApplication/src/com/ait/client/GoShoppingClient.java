package com.ait.client;

import com.ait.application.GSNormalAcc;
import com.ait.application.GSPrimeAcc;
import com.ait.application.GoShopFactory;

public class GoShoppingClient {

	
		public static void main(String[] args) {
			GoShopFactory obj=new GoShopFactory();
			//Prime Account creation
			GSPrimeAcc akshith=(GSPrimeAcc) obj.getNewPrimeAcc(123, "Akshith", 500.0f, true);
			akshith.bookProduct(akshith.getCharges());
			
			//Normal Account creation
			
			GSNormalAcc kumar=(GSNormalAcc) obj.getNewNormalAcc(121, "Kumar", 600.0f,30.0f);
			kumar.bookProduct(kumar.getCharges());

		
	}

}
