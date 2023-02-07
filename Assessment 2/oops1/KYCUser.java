package oops1;

	class KYCUser extends User{
		private int rewardPoints;
		public KYCUser(int id, String userName, String email, double walletBalance) {
			super();
		}
		
		public int getrewardPoints() {
			return rewardPoints;
		}

		public void setrewardPoints(int rewardPoints) {
			this.rewardPoints = rewardPoints;
		}
		@Override
		public boolean makePayment(double billAmount)
		{
			if(billAmount<=getwalletBalance())
			{
				setrewardPoints(getrewardPoints()+(int)(billAmount*0.1));
			}
			return super.makePayment(billAmount);
		}
	
		
		}
	
	 

