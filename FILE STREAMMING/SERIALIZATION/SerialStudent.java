package sp;
public class SerialStudent implements java.io.Serializable{
	int sNum;
	String sName;
	float sMarks;

	public void setNum(int sNum){
		this.sNum = sNum;
	}

	public void setName(String sName){
		this.sName = sName;
	}

	public void setMarks(float sMarks){
		this.sMarks = sMarks;
	}

	public int getNum(){
		return sNum;
	}

	public String getName(){
		return sName;
	}

	public float getMarks(){
		return sMarks;
	}
}