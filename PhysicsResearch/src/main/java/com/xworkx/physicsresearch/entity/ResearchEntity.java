package com.xworkx.physicsresearch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "researchdetails")
@NoArgsConstructor

@NamedQuery(name = "updateQuery", query = "update ResearchEntity re set re.status = :newStatus where re.id = :id")
public class ResearchEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	String title;
	String status;
	String fiels_of_research;
	String director;
	String institute;
	
	
	public ResearchEntity(String title, String status, String fiels_of_research, String director, String institute) {
		super();
		this.title = title;
		this.status = status;
		this.fiels_of_research = fiels_of_research;
		this.director = director;
		this.institute = institute;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFiels_of_research() {
		return fiels_of_research;
	}
	public void setFiels_of_research(String fiels_of_research) {
		this.fiels_of_research = fiels_of_research;
	}
	public String getString() {
		return director;
	}
	public void setString(String director) {
		this.director = director;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	@Override
	public String toString() {
		return "ResearchEntity [id=" + id + ", title=" + title + ", status=" + status + ", fiels_of_research="
				+ fiels_of_research + ", string=" + director + ", institute=" + institute + "]";
	}
	
}
