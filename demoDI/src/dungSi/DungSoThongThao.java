package dungSi;
import nhiemVu.NhiemVu;
public class DungSoThongThao implements DungSi {

	private NhiemVu nhiemVu;
	
	public DungSoThongThao(NhiemVu nhiemVu) {
		this.nhiemVu = nhiemVu;
	}
	@Override
	public void thucHienNV() {
		// TODO Auto-generated method stub
		nhiemVu.thucHien();
	}

}
