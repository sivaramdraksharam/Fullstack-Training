package java8funcinterfaces;

public class Voter {
private int voterId;
private String voterName;
private int voterAge;
public Voter() {
	super();
}
public Voter(int voterId, String voterName, int voterAge) {
	super();
	this.voterId = voterId;
	this.voterName = voterName;
	this.voterAge = voterAge;
}
public int getVoterId() {
	return voterId;
}
public void setVoterId(int voterId) {
	this.voterId = voterId;
}
public String getVoterName() {
	return voterName;
}
public void setVoterName(String voterName) {
	this.voterName = voterName;
}
public int getVoterAge() {
	return voterAge;
}
public void setVoterAge(int voterAge) {
	this.voterAge = voterAge;
}


	
}
