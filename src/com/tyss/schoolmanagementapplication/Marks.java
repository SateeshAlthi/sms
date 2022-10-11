package com.tyss.schoolmanagementapplication;

public class Marks {
	
	private int mMarks;
	private int pMarks;
	private int cMarks;
	private int totalMarks;
	private int percentage;
	
	
	public Marks() {
		
	}
	
	public Marks(int mMarks, int pMarks, int cMarks) {
		super();
		this.mMarks = mMarks;
		this.pMarks = pMarks;
		this.cMarks = cMarks;
		totalMarks = (mMarks+pMarks+cMarks);
		percentage = Math.round(totalMarks/3);
	}
	@Override
	public String toString() {
		return "Marks [mMarks=" + mMarks + ", pMarks=" + pMarks + ", cMarks=" + cMarks + ", totalMarks=" + totalMarks
				+ ", percentage=" + percentage + "]";
	}

	public int getmMarks() {
		return mMarks;
	}

	public int getpMarks() {
		return pMarks;
	}

	public int getcMarks() {
		return cMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public int getPercentage() {
		return percentage;
	}

	public void setmMarks(int mMarks) {
		this.mMarks = mMarks;
	}

	public void setpMarks(int pMarks) {
		this.pMarks = pMarks;
	}

	public void setcMarks(int cMarks) {
		this.cMarks = cMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
}
