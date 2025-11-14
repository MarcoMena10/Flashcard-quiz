
public class FlashCard
	{
		String front;
		String back ;
		String category ;
		int difficulty	;
		boolean mastered;
		public FlashCard(String f, String b, String c, int d, boolean m)
		{
			front = f; //front / term being studied
			back = b;  // definition for the given term
			category = c; // type of term
			difficulty = d; // difficulty out of 5
			mastered = m; // if definition is known by user or not
		}
		public String getFront()
			{
				return front;
			}
		public void setFront(String front)
			{
				this.front = front;
			}
		public String getBack()
			{
				return back;
			}
		public void setBack(String back)
			{
				this.back = back;
			}
		public String getCategory()
			{
				return category;
			}
		public void setCategory(String category)
			{
				this.category = category;
			}
		public int getDifficulty()
			{
				return difficulty;
			}
		public void setDifficulty(int difficulty)
			{
				this.difficulty = difficulty;
			}
		public boolean isMastered()
			{
				return mastered;
			}
		public void setMastered(boolean mastered)
			{
				this.mastered = mastered;
			}
	}