package stud;
class SeriStudent implements java.io.Serializable{
	int sNo;
	String sName;
	double sMarks;

	void setId(int sNo){
		this.sNo = sNo;
	}
	int getId(){
		return sNo;
	}
	void setName(String sName){
		this.sName =sName;
	}
	String getName(){
		return sName;
	}
	void setMarks(double sMarks){
		this.sMarks = sMarks;
	}
	double getMarks(){
		return sMarks;
	}
}