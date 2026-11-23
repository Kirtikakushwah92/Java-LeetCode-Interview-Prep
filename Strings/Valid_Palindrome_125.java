class Valid_Palindrome_125{
	public  static void main(String[]args){
		String s = "A man, a plan, a canal: Panama";
		boolean result = checkPalindrome(s);
		System.out.println(result);
	}
	public static boolean checkPalindrome(String s){
		int left = 0;
		int right = s.length()-1;
		while(left<right){
			
			if(!Character.isLetterOrDigit(s.charAt(left))){
				left++;
			}
			else if(!Character.isLetterOrDigit(s.charAt(right))){

				right--;
			}
			else if(Character.toLowerCase(s.charAt(left))) != Character.toLowerCase(right){
				return false;
			}
			else{
				left++;
				right--;
			}

		}

		
	}

}