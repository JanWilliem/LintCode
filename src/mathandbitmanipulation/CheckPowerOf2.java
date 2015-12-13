package mathandbitmanipulation;

public class CheckPowerOf2 {
	int n = 5;
	boolean b = checkPowerOf2(n);
	private boolean checkPowerOf2(int n) {
		if( n == 1)
		{
		    return true;
		}
		if(n < 0)
		{
		    return false;
		}
		if (((((n - 1) & n) == 0)) && n != 0) {
			return true;
		}
	
		return false;	}
	
}
