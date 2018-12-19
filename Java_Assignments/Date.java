
public class Date {
	
		private int date, month, year; // data members to store the day, month and year of a date.
		public Date(int date, int month, int year) //constructor to initialize Date objects
		{
			//initialize d, m, y of the current object using the d, m, y parameters. 
			this.date=date;
			this.month=month;
			this.year= year;
		}
		
		
		public Date() {
			// TODO Auto-generated constructor stub
			
		}


		public int getDate() {
			return date;
		}
		public void setDate(int date) {
			this.date = date;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public String toString()// method to get the value of a Date object printed
		{
			//return the value of a Date object as a String in d/m/y format.
			return (date+ "/"+month+"/"+year ); 
		
		}

		public boolean isSmaller(Date d)// method to check whether a date is smaller than the other 
		{
			Date givenDate = new Date(21,12,2019);
			//If the value of invoking Date object is smaller than the given object, true is returned otherwise false is returned.
			if(d.date<givenDate.date)
				return true;
						return false;
		}
		public int[] diff(Date d) //method to find out the difference of days, months and years in two dates.
		{
			//The difference of days, months and years in the invoking and parameter Date objects 
			//is obtained and returned in an int array. The first element of the array should represent
			//difference of days; second one, the difference of months and the third one, the difference of years.
			Date givenDate = new Date(20,12,2019);
			Date difference = new Date();
			difference.date = givenDate.date - d.date;
			difference.month = givenDate.month - d.month;
			difference.year = givenDate.year-d.year;
			int[] differences = {difference.date,difference.month,difference.year};
			return differences;
		}
	}
