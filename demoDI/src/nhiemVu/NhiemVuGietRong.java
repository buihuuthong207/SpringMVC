package nhiemVu;

import java.io.PrintStream;

public class NhiemVuGietRong implements NhiemVu {
    private PrintStream stream;
	
    public NhiemVuGietRong(PrintStream stream) {
    	this.stream = stream;
    }
    
	@Override
	public void thucHien() {
		stream.println("dang giet rong may cha noi oi");
	}
}
