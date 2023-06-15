package com.day3;

public class CandidateName {

	public static void main(String[] args){
		
		String CandidateName="Naier";
		
		switch (CandidateName) {
		case "Sharukh":
			System.out.println("Candidate Name is Sharukh");
			break;
			
		case "Saif":
			System.out.println("Candidate Name is Saif");
			break;
			
		case "Naier":
			System.out.println("Candidate Name is Naier");
			break;
			
		case "Taushif":
			System.out.println("Candidate Name is Taushif");
			break;

		default:
			System.out.println("UNKNOWN CANDIDATE");
			//break;
		}
}
}