package cayik.cipher;
/*
 * This test class executes the whole thing.
 * 
 * @autor cayik
 * @verison 2018-10-11
 */

public class Test {
	public static void main(String[] args) {
		
		try {
			SubstitutionCipher s1= new SubstitutionCipher("mnbvcxyasdfghjklöäüpoiuztrewqß"); 
			
			System.out.println("enc: \t");
				String test = s1.encrypt("Test 123abc"); 			
				System.out.println(test);
			System.out.println("dec: \t");
				System.out.println(s1.decrypt(test));
			System.out.println("_________________");
		} catch (MyException e) {
			System.out.println(e.toString());
		}
		
		try {
			ShiftCipher s1= new ShiftCipher(-3); 
			System.out.println("Shift-Cipher:");
			
			System.out.println("enc: \t");
				String test = s1.encrypt("Test 123abc"); 			
				System.out.println(test);
			System.out.println("dec: \t");
				System.out.println(s1.decrypt(test));
		}catch(MyException e) {
			System.out.println(e.toString());
		}
	}
}
