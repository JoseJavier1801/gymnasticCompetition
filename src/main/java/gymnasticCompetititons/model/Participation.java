package gymnasticCompetititons.model;

import java.util.Objects;

public class Participation <T> {
	private Integer dorsalNumber;
	private String initialHour;
	private int points;
	
	public Participation(Integer dorsalNumber, String initialHour, int points) {
		this.dorsalNumber = dorsalNumber;
		this.initialHour = initialHour;
		this.points = points;
	}

	public Participation() {
		this(-1,"",0);
	}

	public Integer getDorsalNumber() {
		return dorsalNumber;
	}

	public void setDorsalNumber(Integer dorsalNumber) {
		this.dorsalNumber = dorsalNumber;
	}

	public String getInitialHour() {
		return initialHour;
	}

	public void setInitialHour(String initialHour) {
		this.initialHour = initialHour;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dorsalNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participation other = (Participation) obj;
		return Objects.equals(dorsalNumber, other.dorsalNumber);
	}

	@Override
	public String toString() {
		return "Participation "
					+ "\n\tDorsal number: " + dorsalNumber 
					+ "\n\tInitial hour=" + initialHour 
					+ "\n\tpoints=" + points;
	}
	
	
	
}