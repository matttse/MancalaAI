package model;

public class Board extends Bucket{
	protected String bucketState;//filled or not filled
	protected String bucketId;//id of the bucket
	
	public Board() {
		initialize();
	}

	public String getBucketState() {
		return bucketState;
	}

	public void setBucketState(String bucketState) {
		this.bucketState = bucketState;
	}

	public String getBucketId() {
		return bucketId;
	}

	public void setBucketId(String bucketId) {
		this.bucketId = bucketId;
	}
	
	public void initialize() {
		Bucket a1 = null;
		Bucket a2 = null;
		Bucket a3 = null;
		Bucket a4 = null;
		Bucket a5 = null;
		Bucket a6 = null;
		Bucket b1 = null;
		Bucket b2 = null;
		Bucket b3 = null;
		Bucket b4 = null;
		Bucket b5 = null;
		Bucket b6 = null;
		
		a1.setBucketNumber("1");
		a2.setBucketNumber("3");
		a3.setBucketNumber("5");
		a4.setBucketNumber("7");
		a5.setBucketNumber("9");
		a6.setBucketNumber("11");
		b1.setBucketNumber("2");
		b2.setBucketNumber("4");
		b3.setBucketNumber("6");
		b4.setBucketNumber("8");
		b5.setBucketNumber("10");
		b6.setBucketNumber("12");
		
		a1.setBucketValue("4");
		a2.setBucketValue("4");
		a3.setBucketValue("4");
		a4.setBucketValue("4");
		a5.setBucketValue("4");
		a6.setBucketValue("4");
		b1.setBucketValue("4");
		b2.setBucketValue("4");
		b3.setBucketValue("4");
		b4.setBucketValue("4");
		b5.setBucketValue("4");
		b6.setBucketValue("4");
		
	}
}
