package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String name;
	public int rating;
	public String review;
	
	public Contact() { 
		super();
	}
	
	public Contact(String name) {
		super();
		this.name = name;
	}

	public Contact(String name, int rating, String review) {
		super();
		this.name = name;
		this.rating = rating;
		this.review = review;
	}

	public Contact(long id, String name, int rating, String review) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.review = review;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", rating=" + rating + ", review=" + review + "]";
	}

}