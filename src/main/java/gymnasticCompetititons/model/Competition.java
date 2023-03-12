package gymnasticCompetititons.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Competition {
	private String name;
	private String description;
	private String initialDate;
	ArrayList<Trial> trials = new ArrayList<Trial>();
	
	Map<Integer, Participation> participations = new HashMap<>();


	public Competition(String name, String description, String initialDate) {
		super();
		this.name = name;
		this.description = description;
		this.initialDate = initialDate;
	}


	public Competition() {
		this("","","");
	}

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getInitialDate() {
		return initialDate;
	}


	public void setInitialDate(String initialDate) {
		this.initialDate = initialDate;
	}


	public ArrayList<Trial> getTrials() {
		return trials;
	}


	public void setTrials(ArrayList<Trial> trials) {
		this.trials = trials;
	}


	public Map<Integer, Participation> getParticipations() {
		return participations;
	}


	public void setParticipations(Map<Integer, Participation> participations) {
		this.participations = participations;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Competition other = (Competition) obj;
		return Objects.equals(name, other.name);

	@Override
	public String toString() {
		return "Competition "
					+ "\n\tName:" + name
					+ "\n\tDescription=" + description  
					+ "\n\tInitial date=" + initialDate ;
	}

	/**
	 * Add a trial
	 * @param trial add
	 * @return True if it has been added successfully and false if not
	 */
	public boolean addTrial(Trial trial) {
		boolean result = false;
		if(trial!=null && !isTrial(trial)) {
			trials.add(trial);
			result = true;
		}
			
		return result;
	}

	/**
	 * To see a trial
	 * @param type: trial key
	 * @param category: trial key
	 * @param kit: trial key
	 * @return The trial sought by the parameters
	 */
	public Trial showTrial(String type, String category, String kit) {
		Trial trial = null;
		if(trials!=null) {
			Iterator<Trial> it = trials.iterator();
			while(it.hasNext()){
				Trial trial = it.next();
				if (trials.getType().getCategory().getKit().equalsIgnoreCase(type, category, kit)) {
					trial = trials;
				}
					
			}
		}
		
		
		
		return trial;
	}
	
	/**
	 * Method to change a trial
	 * @param trial to change
	 * @return true if the change was successful and false if not
	 */
	public boolean changeTrial(Trial trial) {
		boolean result = false;
		
		if(trial != null  &&  showArticle(trial.getType().getCategory().getKit())!=null) {
			Iterator<Trial> it = trials.iterator();
			while(it.hasNext()){
				Trial trials = it.next();
				if (trials.equals(trial)) {
					trials = trial;
					result = true;
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Method to delete a trial
	 * @param trial to delete
	 * @return true if the delete was successful and false if not
	 */
	public boolean removeTrial(Trial trial) {
		boolean result = false;
		
		if(trials!=null && showTrial(trial.getType().getCategory().getKit())!=null) {
			Iterator<Trial> it=trials.iterator();
			while(it.hasNext()){
				Trial trials = it.next();
				if (trials.equals(trial)) {
					it.remove();
					result = true;
				}
			}
		}
		
		
		return result;
	}
	
	/**
	 * Look for trial
	 * @param trial to search
	 * @return true if found and false if not
	 */
	public boolean isTrial(Trial trial) {
		boolean result = false;
		Iterator<Trial> it = trials.iterator();
		while(it.hasNext()){
			Trial trials = it.next();
			if (trials!=null && trial.equals(trials)) {
				result = true;
				break;
			}
				
		}
		
		return result;
	}
	
	/**
	 * Add a participation
	 * @param participation add
	 * @param key add
	 * @return True if it has been added successfully and false if not
	 */
	public boolean addParticipation(Participation participation, int key) {
		boolean result = false;
		if(participation!=null && !isParticipation(participation)) {
			participation.put(participation.getDorsalNumber(), participation);
			result = true;
		}
		
		return result;
	}
	
	/**
	 * To see a participation
	 * @param dorsalNumber participation key
	 * @return The participation sought by the parameters
	 */
	public Participation showParticipation(int dorsalNumber) {
			
		Participation participation = null;
		Iterator<Integer> it = participations.keySet().iterator();
		while(it.hasNext()){
			Integer key = it.next();
			participation = participations.get(dorsalNumber);	
		}
		
		return participation;
	}
	
	/**
	 * To see all participations
	 */
	public void showAllParticipation(){
		Participation participation = null;
		Iterator<String> it = participations.keySet().iterator();//tambien se puede recorer con un forEach
		while(it.hasNext()) {
			String key = it.next();
			//esto te da el valor perteneciente a esa key:
			System.out.println(participations.get(key));
		}
	}
	 
	/**
	 * Method to delete a participation
	 * @param participation to delete
	 * @return true if the delete was successful and false if not
	 */
	public boolean removeParticipation(Participation participation, int key) {
		boolean result = false;
		if(participation!=null && !isProduct(participation)) {
			participations.remove(participation.getDorsalNumber(), participation);
			result = true;
		}
		
		return result;
	}
	 
	/**
	 * Method to change a particpation
	 * @param participation to change
	 * @return true if the change was successful and false if not
	 */
	public boolean changeParticipation(Map<Integer, Participation> participation) {
		boolean result = false;
		
		if(participation != null  &&  showParticipation((participation).getDorsalNumber())!=null) {
			Iterator<Integer> it = participations.keySet().iterator();
			while(it.hasNext()){
				Integer key = it.next();
				if (participations.equals(participation)) {
					participations = participation;
					result = true;
				}
			}
		}
		
		return result;
	}
	 
	/**
	 * Look for participation
	 * @param participation to search
	 * @return true if found and false if not
	 */
	public boolean isParticipation(Participation participation) {
		boolean result = false;
		Iterator<Integer> it = participations.keySet().iterator();
		while(it.hasNext()){
			Integer key = it.next();
			if (participations!=null && participation.equals(participations)) {
				result = true;
				break;
			}
				
		}
		
		return result;
	}

}