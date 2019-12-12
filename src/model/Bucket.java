package model;

public abstract class Bucket {
	protected String bucketNumber = "";
	protected String bucketValue = "";
	
	public String getBucketNumber() {
		return bucketNumber;
	}
	public void setBucketNumber(String bucketNumber) {
		this.bucketNumber = bucketNumber;
	}
	public String getBucketValue() {
		return bucketValue;
	}
	public void setBucketValue(String bucketValue) {
		this.bucketValue = bucketValue;
	}
	
	public Bucket() {
		
	}

}
