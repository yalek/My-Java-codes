class Kevin {
	private String name;
	private int first;
	private int second;
	private int sum;

	public Kevin(){
  		System.out.println("Welcome to Kevin constractor");
	}

	public Kevin(String name){
		System.out.println(name);
	}

	public Kevin(String name, int x, char y){
		System.out.println(name +"\t"+ x +"\t"+ y);
	}

	public void setFirst(int first){
		this.first = first;
	}
	
	public int getFirst(){
		return first;
	}

	public void setSecond(int second){
		this.second = second;
	}
	
	public int getSecond(){
		return second;
	}

	public void setSum(){
		this.sum = first + second;
	}

	public int getSum(){
		return sum;
	}
}
