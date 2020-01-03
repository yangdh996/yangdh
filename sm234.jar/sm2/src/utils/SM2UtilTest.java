package utils;

import java.util.Arrays;


public class SM2UtilTest {
	/** ÔªÏûÏ¢´® */
	
	private static String M="a=1|b=33|c=º«";
	public static void main(String[] args) {
		SM2Util sm2 = new SM2Util();
		SM2KeyPair keyPair = sm2.generateKeyPair();
		byte[] data = sm2.encrypt(M,keyPair.getPublicKey());
		System.out.println("data is:"+Arrays.toString(data));
		
		System.out.println("keyPair.getPublicKey() is:"+keyPair.getPublicKey());
		System.out.println("keyPair.getPrivateKey() is:"+keyPair.getPrivateKey());
		
		sm2.decrypt(data, keyPair.getPrivateKey());
		}
	
	}


18093736458423356838901392716831399966612627955634298451020348022558072519349

