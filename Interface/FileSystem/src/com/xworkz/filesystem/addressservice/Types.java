package com.xworkz.filesystem.addressservice;

import com.xworkz.filesystem.addressreprository.AddressRepository;

public class Types implements Address {

	AddressRepository addressRepository;

	public Types(AddressRepository addressRepository) {
		addressRepository = addressRepository;
	}

	@Override
	public boolean push(AddressRepository addressRepository) {
		if (addressRepository != null) {
			boolean bool = addressRepository.save();
			if (bool) {
				System.out.println("Files are pushed");
				addressRepository.save();
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("File is not pushed");
			return false;
		}
	}

	@Override
	public int refresh(AddressRepository addressRepository) {
		System.out.println("Refresh the repository");
		if (addressRepository != null) {
			int x = addressRepository.update();
			if (x > 1) {
				System.out.println("File is updates");
			} else {
				System.out.println("File is not updated");
			}
		}
		/*
		 * else { System.out.println("File "); }
		 */
		return 1;
	}

	@Override
	public void remove(AddressRepository addressRepository) {
		if (addressRepository != null) {
			System.out.println("The file is removed");
		} else {
			System.out.println("The file is not removed");
		}

	}

	@Override
	public String load(AddressRepository addressRepository) {
		if (addressRepository != null) {
			String str = addressRepository.read();
			if (str != null) {
				System.out.println("The file is loaded");
				return "lodded fiile";
			} else {
				return null;
			}
		}
		// System.out.println("The file is loaded");
		return "File";
	}

	/*
	 * public check(AddressRepository addressRepository) { if(addressRepository !=
	 * null) { if() } }
	 */

}
