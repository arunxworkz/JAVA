package com.xworkz.logibase.internal;

public class InvokeMethods {
	
	public String insert() {
		return "INSERT INTO details (id, username, password) VALUES "
				+ "('1', 'arun', 'aru123'), "
				+ "('2', 'karthik', 'kar1234'), "
				+ "('3', 'Naga', 'naga12345'), "
				+ "('4', 'osama', 'osama12345'), "
				+ "('5', 'chethan', 'che987'), "
				+ "('6', 'charan', 'cha123456'), "
				+ "('7', 'Shamanth', 'sh987'), "
				+ "('8', 'Ajay', 'aj8745'), "
				+ "('9', 'Sachine', 'sach965'), "
				+ "('10', 'Shashank', 'sha654'), "
				+ "('11', 'Abhishek', 'abi546'), "
				+ "('12', 'Amoga', 'amo623'), "
				+ "('13', 'Manoj', 'manoj3256'), "
				+ "('14', 'Deekap', 'de14'), "
				+ "('15', 'Kalmlesh', 'kamlaa45'), "
				+ "('16', 'Pranav', 'pran456'), "
				+ "('17', 'Rohan', 'roh6321'), "
				+ "('18', 'Rahul', 'rahul149'), "
				+ "('19', 'Loki', 'loki956'), "
				+ "('20', 'Raki', 'raki349')";

	}
	
	//This can not be done because sql does not allow any multiple updates in a single query
	public String update() {
		return "update details set password = 'na6498' where id = '3',"
				+ "update details set password = 'osa567' where id = '4',"
				+ "update details set password = 'ch7863' where id = '5',"
				+ "update details set password = 'cha624' where id = '6',"
				+ "update details set password = 'shamanth4562' where id = '7',"
				+ "update details set password = 'ajay78963' where id = '8',"
				+ "update details set password = 'sh2346' where id = '9',"
				+ "update details set password = 'shak723@' where id = '10'";
	}
}


