package exceptions;

public class TratamentosExceptions {
	
	public static void main(String[] args) throws DivisaoPorZeroException {
		
		 try {
			int val = 10/0;
			System.out.println(val);
		} catch (Exception e) {
			throw new DivisaoPorZeroException();
		}
	}
}
