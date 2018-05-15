package nhiemVu;

import java.io.PrintStream;

public class NhiemVuDi implements NhiemVu {

	private int[] arr = {3, 4, 5, 6, 7}; 
	
	private PrintStream stream;
	
	public NhiemVuDi(PrintStream stream)
	{
		this.stream = stream;
	}
	
	@Override
	public void thucHien() {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i ++)
		{
			stream.println("Di duoc " + arr[i] + " buoc");
		}
	}

}
