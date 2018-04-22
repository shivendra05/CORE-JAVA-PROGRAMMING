class Generic<A,B>{
	A k;
	B v;
	Generic(A k,B v){
		this.k=k;
		this.v=v;
	}
	Generic(){
		k=null;
		v=null;
	}
	void setValue(A k,B v){
		this.k=k;
		this.v=v;
	}
	A getValueK(){
		return k;
	}
	B getValueV(){
		return v;
	}
}

class GenericImp{
	public static void main(String[] args){
		System.out.println("\n======Generic Example=======\n");

		Generic<Integer,Integer> in = new Generic<Integer,Integer>(10,20);
		Generic<Double,Double> du = new Generic<Double,Double>(10.1,20.2);
		Generic<Character,Character> ch = new Generic<Character,Character>('A','B');
		Generic<String,String> st = new Generic<String,String>("Shivendra","Pandey");
		
		System.out.println("Interger value a: "+in.getValueK());
		System.out.println("Interger value b: "+in.getValueV());

		System.out.println("Double value a: "+du.getValueK());
		System.out.println("Double value b: "+du.getValueV());

		System.out.println("charater value a: "+ch.getValueK());
		System.out.println("charater value b: "+ch.getValueV());

		System.out.println("String value a: "+st.getValueK());
		System.out.println("String value b: "+st.getValueV());
	}
}
