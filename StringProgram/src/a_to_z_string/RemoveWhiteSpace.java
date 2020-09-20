package a_to_z_string;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String a="abc nhj  k	dn  mn	xm     dk"
				+ "mx cc c cdow oe ";
		String b="";
		char[] space=a.toCharArray();
		int length=space.length;
		/*
		 * for (int i = 0; i < space.length; i++) { if(space[i]==' '||space[i]==' ') {
		 * 
		 * b=b+a.charAt(i);
		 * 
		 * }
		 * 
		 * }
		 */
		a=a.replaceAll("\\s","");
		System.out.println(a);
		System.out.println("\"yyy\""+"y");

	}

}
