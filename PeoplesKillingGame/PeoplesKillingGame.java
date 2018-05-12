/*
 * Code 100 peoples standing in a circle with one sword puzzle.
 * 
 * @author  Girish.D
 */
public class PeoplesKillingGame
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please specify number of person palying game: ");
		int totalNo = sc.nextInt();
		
		if(totalNo <= 0)
		{
			System.out.println("No person available for play game. Please increase persion");
			return;
		}
		else if(totalNo == 1)
		{
			System.out.println("Only one person only playing. So survied person is: "+totalNo);
			return;
		}

		//All Peoples we are putting in to a list.
		ArrayList<Integer> al = (ArrayList<Integer>) getListOfPersions(totalNo);
		//Finding the survive person form given list of peoples.
		int survivePersion = getFinalSurvivePerson(al);
		System.out.println("Out of "+totalNo+" persons, survived person is: "+survivePersion+" person.");		
	}
	
	public static List<Integer> getListOfPersions(int totNoOfPersions)
	{
		List<Integer> totPeoples = new ArrayList<Integer>();
		for (int i = 1 ; i <= totNoOfPersions ; i++)
		{
			totPeoples.add(i);
		}
		return totPeoples;
	}
	
	public static int getFinalSurvivePerson(ArrayList<Integer> personsList)
	{
		for(int i = 1; i < personsList.size(); ++i)
		{
			if(personsList.size() == 1)
				break;
			
			if(i == personsList.size()-1)
			{
				personsList.remove(i);
				i = 0;
			}
			else
			{
				personsList.remove(i);
				if((i+1) == personsList.size())
				{
					personsList.remove(0);
					i=0;
					continue;
				}
			}
		}
		return personsList.get(0);
	}
}


