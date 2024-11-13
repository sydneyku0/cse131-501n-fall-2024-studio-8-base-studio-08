package studio8;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;

	
	public MultipleChoiceQuestion(String initprompt, String initanswer, int initpoints, String[] initchoices) {
		super (initprompt, initanswer, initpoints);
		this.choices = initchoices;
	}
	
	public String[] getChoices(){
		return choices;
	}
	
	
	@Override
	public void displayPrompt() {
		System.out.println(this.getPrompt() + "(" + this.getPoints() + " points)");
		for(int i=0; i<choices.length; i++) {
			System.out.println(this.choices[i]);
		}
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
