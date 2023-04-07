package dao;

import java.util.ArrayList;

import entity.DichVu;
import entity.DichVu.enum_LoaiDV;

public class DichVuDAO {
	private ArrayList<DichVu> listDV;

	public DichVuDAO() {
		listDV = new ArrayList<DichVu>();
	}
	/**Lay danh sach cac dich vu hien co
	 * 
	 * @return ArrayList<DichVu>
	 */
	public ArrayList<DichVu> getDSDV() {
		return listDV;
	}
	
	/**
	 * Them mot dich vu, co kiem tra trung ma dich vu
	 * @param dv
	 * @return boolean
	 */
	public boolean addDV(DichVu dv) {
		int id = 1;
		if (listDV != null && listDV.size() > 0) {
			id = listDV.size() + 1;
		}
		dv.setMaDV(id);
		listDV.add(dv);
		return true;
	}

	/**
	 * xoa 1 dich vu khoi danh sach
	 * @param maDV
	 * @return boolean
	 */
	public boolean deleteDV(int maDV) {
		for (DichVu dv : listDV) {
			if (dv.getMaDV() == maDV) {
				listDV.remove(dv);
				return true;
			}
		}
		return false;
	}

	/**
	 * Cap nhat danh sach khi biet ma dich vu, truyen vao ham la mot doi tuong dich vu moi
	 * @param maDV
	 * @param dvNew
	 * @return boolean
	 */
	public boolean updateDV(int maDV, DichVu dvNew) {
		for (DichVu dv : listDV) {
			if (dv.getMaDV() == maDV) {
				dv.setTenDV(dvNew.getTenDV());
				dv.setDonGia(dvNew.getDonGia());
				dv.setLoaiDV(dvNew.getLoaiDV());
				return true;
			}
		}
		return false;
	}

	/**
	 * Lay danh sach theo loai dich vu
	 * @param loaiDV
	 * @return danh sach theo foods / theo drinks
	 */
	public ArrayList<DichVu> getDSTheoLoai(enum_LoaiDV loaiDV) {
		ArrayList<DichVu> listDVNew = new ArrayList<DichVu>();
		switch (loaiDV) {
			case Foods -> {
				for (DichVu dv : listDV) {
					if (dv.getLoaiDV() == enum_LoaiDV.Foods) {
						listDVNew.add(dv);
					}
				}
			}
	
			case Drinks -> {
				for (DichVu dv : listDV) {
					if (dv.getLoaiDV() == enum_LoaiDV.Drinks) {
						listDVNew.add(dv);
					}
				}
			}
	
			default -> throw new IllegalArgumentException("Unexpected value: " + loaiDV);
		}
		return listDVNew;
	}
}
