
class AslMe implements SharedConstants{
	static void answer(int result){
		switch(result){
		case NO:
			System.out.println("No");
			break;
		case YES:
			System.out.println("YES");
			break;
		case MAYBE:
			System.out.println("Maybe");
			break;
		case LATER:
			System.out.println("later");
			break;
		case SOON:
			System.out.println("soon");
			break;
		case NEVER:
			System.out.println("never");
			break;
		}
	}
	public static void main(String args[]){
		Question q=new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}


}
