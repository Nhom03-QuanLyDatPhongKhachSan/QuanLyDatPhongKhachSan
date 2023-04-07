package entity;

public class DichVu {
	private int maDV;
	private String tenDV;
	private double donGia;

	public enum enum_LoaiDV {
		Foods, Drinks
	};

	private enum_LoaiDV loaiDV;

	public DichVu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DichVu(int maDV, String tenDV, double donGia,
			enum_LoaiDV loaiDV) {
		super();
		this.maDV = maDV;
		this.tenDV = tenDV;
		this.donGia = donGia;
		this.loaiDV = loaiDV;
	}

	public DichVu(int maDV) {
		super();
		this.maDV = maDV;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maDV;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DichVu other = (DichVu) obj;
		if (maDV != other.maDV)
			return false;
		return true;
	}

	public int getMaDV() {
		return maDV;
	}

	public void setMaDV(int maDV) {
		this.maDV = maDV;
	}

	public String getTenDV() {
		return tenDV;
	}

	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public enum_LoaiDV getLoaiDV() {
		return loaiDV;
	}

	public void setLoaiDV(enum_LoaiDV loaiDV) {
		this.loaiDV = loaiDV;
	}
}
