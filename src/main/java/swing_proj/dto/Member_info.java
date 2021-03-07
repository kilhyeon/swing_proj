package swing_proj.dto;

public class Member_info {
	private int mNo;
	private String mName;
	private int mBirth;
	private int mTel;
	private int mCp;
	private String mAdd;

	public Member_info() {
		// TODO Auto-generated constructor stub
	}

	public Member_info(int mNo, String mName, int mBirth, int mTel, int mCp, String mAdd) {
		this.mNo = mNo;
		this.mName = mName;
		this.mBirth = mBirth;
		this.mTel = mTel;
		this.mCp = mCp;
		this.mAdd = mAdd;
	}

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public int getmBirth() {
		return mBirth;
	}

	public void setmBirth(int mBirth) {
		this.mBirth = mBirth;
	}

	public int getmTel() {
		return mTel;
	}

	public void setmTel(int mTel) {
		this.mTel = mTel;
	}

	public int getmCp() {
		return mCp;
	}

	public void setmCp(int mCp) {
		this.mCp = mCp;
	}

	public String getmAdd() {
		return mAdd;
	}

	public void setmAdd(String mAdd) {
		this.mAdd = mAdd;
	}

	@Override
	public String toString() {
		return String.format("Member_info [mNo=%s, mName=%s, mBirth=%s, mTel=%s, mCp=%s, mAdd=%s]", mNo, mName, mBirth,
				mTel, mCp, mAdd);
	}

}
