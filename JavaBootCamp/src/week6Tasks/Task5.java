package week6Tasks;

public class Task5 {
	
	public static boolean isPalandrome() {
		
		String s = "A man, a plan, a canal: Panama";
		
		if(s.isEmpty()) {
			return true;
		}
		s = s.toLowerCase();
		s = s.replaceAll("[^a-z\\d]","");
		
		String reverseStr = "";
		
		for (int i = s.length() - 1; i >=0 ; i--) {
			reverseStr += s.charAt(i);
		}
		
		return s.equals(reverseStr);
	}
	
	public static void main(String[] args) {
		System.out.println(Task5.isPalandrome());
	}
}
