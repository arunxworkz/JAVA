package com.xworkx.physicsresearch.runner;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;

import com.xworkx.physicsresearch.Servicer.ResearchService;
import com.xworkx.physicsresearch.Servicer.ResearchServiceImpl;
import com.xworkx.physicsresearch.entity.ResearchEntity;

public class Runner {

	public static void main(String[] args) {
		
		ResearchEntity entity1 = new ResearchEntity("Investigating Gravitational Wave Signals", "Ongoing", "Gravitational Physics", "Dr. Vikram Sharma", "IUCAA Pune");
		
		List<ResearchEntity> li = new ArrayList<ResearchEntity>();
		li.add(new ResearchEntity("Investigating Gravitational Wave Signals", "Ongoing", "Gravitational Physics", "Dr. Vikram Sharma", "IUCAA Pune"));
		li.add(new ResearchEntity("Quantum Entanglement in Solid-State Systems", "Ongoing", "Quantum Mechanics", "Dr. Neha Kapoor", "TIFR Mumbai"));
		li.add(new ResearchEntity("Dark Matter Search Using Underground Detectors", "Ongoing", "Astroparticle Physics", "Dr. Arjun Menon", "IISc Bangalore"));
		li.add(new ResearchEntity("High-Temperature Superconductivity in Materials", "Ongoing", "Condensed Matter Physics", "Dr. Kavita Rao", "IIT Kanpur"));
		li.add(new ResearchEntity("Magnetohydrodynamics in Plasma Reactors", "Ongoing", "Plasma Physics", "Dr. Rajesh Kulkarni", "IPR Gandhinagar"));
		li.add(new ResearchEntity("Numerical Simulations of Black Hole Dynamics", "Ongoing", "Theoretical Astrophysics", "Dr. Anjali Das", "RRI Bangalore"));
		li.add(new ResearchEntity("Optical Precision Measurements of Fundamental Constants", "Completed", "Experimental Physics", "Dr. Sanjay Patel", "PRL Ahmedabad"));
		li.add(new ResearchEntity("Development of Photonic Quantum Computing Systems", "Ongoing", "Photonics", "Dr. Priya Verma", "IIT Madras"));
		li.add(new ResearchEntity("Study of Neutrino Oscillations", "Completed", "Particle Physics", "Dr. Suresh Nair", "Bhabha Atomic Research Centre, Mumbai"));
		
		
		
		ResearchService reService = new ResearchServiceImpl();
		reService.save(li);
	}

}
