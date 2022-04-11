package practical_8;

public class p08__string {
	
		public static void main(String[] args) {

			QuestionsOnString obj = new QuestionsOnString();

			String s1 = new String("75457");
			String s2 = new String("7545a");
			

			obj.palindromeOrNot(s1);
			obj.reverseOfAString(s1);
			obj.stringEqualOrNot(s1, s2);
		}

	}

	class QuestionsOnString {
		String revstring="";
		char rs;
		void palindromeOrNot(String s) {
			
			int i=0,j=s.length()-1;
			while (i < j) {
	            if (s.charAt(i)!= s.charAt(j))
	                System.out.println("False");
			
	            i++;
	            j--;
		}
			System.out.println("true");
	    }

		void reverseOfAString(String s) {
			// Write Logic Here!
		
			for(int i=0;i<s.length();i++)
			{
				rs=s.charAt(i);
				revstring=rs+revstring;
						
			}
			System.out.println("reverse string is"+revstring);
		}
		
			void stringEqualOrNot(String s1,String s2) {
				if(s1.equals(s2))
				{
					System.out.println("s1 = s2 ");
				}
				else {
					System.out.println("s1 not equal to s2");
				}
			}
}

