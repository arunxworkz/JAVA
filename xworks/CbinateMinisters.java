class CbinateMinisters{
	
	public static void states(String[] states1){
		
		for(int stateno = 0;stateno <= states1.length - 1;stateno++){
			System.out.println(states1[stateno]);
		}
	}
	
	public static void pincode(int[] codes){
		for(int noofcodes = 0;noofcodes <= codes.length - 1; noofcodes++){
			System.out.print(" "+codes[noofcodes]);
		}
	}
	
	public static void primeMinisters(String[] cabinate){
		for(int i = 0;i <= cabinate.length - 1; i++){
			System.out.println(cabinate[i]);
		}
	}
	
	public static void cabinateMinisters(String[] ministers){
		for(int centeralministers = 0;centeralministers<=ministers.length - 1;centeralministers++){
			System.out.println(ministers[centeralministers]);
		}
	}
	
	public static void politicalParties(String[] parties){
		for(int j = 0;j<=parties.length - 1; j++){
			System.out.println(parties[j]);
		}
	}
	
	public static void main(String[] args){
		
		String[] state2 = {"Karnataka", "Tamilnadu", "Gujrat", "Andra Pradesh", "Jammu and Kashmir", "Himachal Pradesh", "Kerala", "Rajastan", "Uttar Pradesh", "Asam", "Bihar", "Telagana", "West Bengal", "Uttarakhand", "Sikkim", "Rajastan", "Panjab", "Odisha", "Manipur", "Maharastra", "Madya Pradesh", "Jarkhand", "Himachal Pradesh", "Haryana", "Goa", "Chhattisgarh", "Mizoram", "Nagaland"};
		states(state2);
		
		int[] codes = {577101, 560001, 560005, 560004, 560001, 560010, 570001, 570008, 570016, 570007};
		pincode(codes);
		 
		String[] ministers = {"Javahar(1924- 2018)lal Neharu (1889–1964)", "Gulzarilal Nanda (1898-1998)", "Lal Bahadur Shastri (1904–1966)", "Gulzari Lal Nanda (1898-1998)", "Indira Gandhi (1917–1984)", 
		"Morarji Desai 	(1896–1995)", "Charan Singh (1902–1987)", 	
"Rajiv Gandhi(1944–1991)", "V. P. Singh ((1931–2008)", "Chandra Shekhar (1927–2007)", 
"P. V. Narasimha Rao(1921–2004)", "Atal Bihari Vajpayee (1924- 2018)", 
"H. D. Deve Gowda (born 1933)", "Inder Kumar Gujral(1919–2012)", "Manmohan Singh (born 1932)",
"Narendra Modi born 1950)"};
		primeMinisters(ministers);
		
		String[] centeralministers = {"Shri Raj Nath Singh: Ministry of Defence", "Shri Nitin Jairam Gadkari: Ministry of Road Transport and Highways", "Dr. Subrahmanyam Jaishankar: Ministry of External Affairs", 
		"Shri H. D. Kumaraswamy: Ministry of Heavy Industries", 
		"Shri Dharmendra Pradhan: Ministry of Education", "Shri Pralhad Joshi: Ministry of Consumer Affairs, Food and Public Distribution", "Shri Chirag Paswan: Ministry of Food Processing Industries", "Shri Amit Shah: Ministry of Home Affairs","Shri Jagat Prakash Nadda: Ministry of Health and Family Welfare", "Smt. Nirmala Sitharaman: Ministry of Finance", "Shri V. Somanna: Ministry of Jal Shakti", "Shri Jitin Prasada: Ministry of Commerce and Industry"};
		cabinateMinisters(centeralministers);
		
		String[] parties = {"BJG", "APP", "Congress", "Shivsena", "Janathadala"};
		politicalParties(parties);
	}
}