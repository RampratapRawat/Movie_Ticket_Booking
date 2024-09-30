package com.example.Utility;

import java.util.HashMap;
import java.util.Map;

public class ValidPaymentInfo{
	
	private static Map<String,Double> paymentInfo= new HashMap<>();
	
	static {
		paymentInfo.put("acc1", 1000.0);
		paymentInfo.put("acc2", 500.0);
		paymentInfo.put("acc3", 2000.0);
	}
	public static boolean validateCreditinfo(String accNo,double paidAmount)throws Exception {
	     boolean a=false;
		if(paidAmount>0) {
			for(int i=0;i<paymentInfo.size();i++){
				if(paidAmount == paymentInfo.get(accNo)) {
					a=true;
				}
			}
		}
		
		if(a==true) {
			return true;
		}
		else {
			 throw new Exception("Insufficent Balance");
		}
		
		
	}
}