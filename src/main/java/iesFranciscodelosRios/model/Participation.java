package iesFranciscodelosRios.model;

import com.sun.istack.NotNull;
import iesFranciscodelosRios.Enum.Type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.Objects;
@XmlAccessorType(XmlAccessType.FIELD)
public class Participation <T> implements Comparable<Participation>{
	private Integer dorsalNumber;
	private String initialHour;
	private int points=0;
	private T obj;
	private Type type;
	
	public Participation(T obj,Integer dorsalNumber, String initialHour,Type type) {
		this.obj=obj;
		this.dorsalNumber = dorsalNumber;
		this.initialHour = initialHour;
		this.type=type;
	}

	public Participation() {

	}

	public Integer getDorsal() {
		return dorsalNumber;
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

	public Type getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Participation: \n\t\t"+
				"Dorsal number : " + dorsalNumber +"\n\t\t"+
				"Initial hour :" + initialHour +"\n\t\t"+
				"points :" + points+"\n";
	}


	@Override
	public int compareTo(@NotNull Participation o) {
		return Integer.compare(o.points ,points);
	}
	
	
	
}
