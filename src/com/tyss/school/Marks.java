package com.tyss.school;

public class Marks {
	
	private int theoryMarks;
	private int practicalMarks;
	
	public Marks() {
		
	}

	public Marks(int theoryMarks, int practicalMarks) {
		super();
		this.theoryMarks = theoryMarks;
		this.practicalMarks = practicalMarks;
	}

	public int getTheoryMarks() {
		return theoryMarks;
	}

	public int getPracticalMarks() {
		return practicalMarks;
	}

	public void setTheoryMarks(int theoryMarks) {
		this.theoryMarks = theoryMarks;
	}

	public void setPracticalMarks(int practicalMarks) {
		this.practicalMarks = practicalMarks;
	}

	@Override
	public String toString() {
		return "Marks [theoryMarks=" + theoryMarks + ", practicalMarks=" + practicalMarks + "]";
	}
}
