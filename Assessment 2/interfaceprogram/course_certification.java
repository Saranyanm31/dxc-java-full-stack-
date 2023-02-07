package interfaceprogram;

	public  class course_certification extends technical_certification implements certificate {
	    private int duration;
		public course_certification(String studentname, String coursename, int admissiontestmark,int duration) {
			super(studentname, coursename, admissiontestmark);
			this.duration=duration;
		}
		

		public int getDuration() {
			return duration;
		}


		public void setDuration(int duration) {
			this.duration = duration;
		}


		@Override
		public double calculate(double total) {
			if(super.getAdmissiontestmark()>=90)
			{
				int amount=2000*getDuration();
			    total=amount-amount*10/100;
			}
			else if(super.getAdmissiontestmark()>75 && super.getAdmissiontestmark()<89)
			{
				int amount=2000*getDuration();
			    total=amount-amount*5/100;
			}
			else
			{
				int amount=2000*getDuration();
			    total=amount;
			}
		
			return total;
		}

		

		


}
