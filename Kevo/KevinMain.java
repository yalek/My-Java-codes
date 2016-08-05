
class KevinMain {
	public static void main(String args[]){
		Kevin kev = new Kevin("This is an argument...");
		//Kevin kevo = new Kevin("Good work",210,'p');
		kev.setFirst(2000);
		kev.setSecond(3000);
		kev.setSum();
		System.out.println(kev.getSum());
		System.out.println(kev.getFirst());
	}
}
