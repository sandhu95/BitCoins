
public class BlockChain {
	// declaring the properties of the class
	private int hash;
	private int previousHash;
	private String data;

	// creating the constructor to initialize the genesis block
	public BlockChain(String data) {
		// setting the data
		this.data = data;

		// creating the hash code from both data and timeStamp generated by the system
		this.hash = (this.data).hashCode();
	}

	// creating constructor to create further blocks in blockChain
	public BlockChain(String data, int previousHash) {
		System.out.println(previousHash);
		// setting the data
		this.data = data;

		this.previousHash = previousHash;

		// creating the hash code from data, timeStamp and previousHash generated by the
		// system
		this.hash = (data + previousHash).hashCode();
	}

	// getters and setters
	public int getHash() {

		return hash;
	}

	public void setHash() {
		this.hash = (this.data).hashCode();
	}

	public void setHash(int previousHash) {
		this.hash = (this.data + previousHash).hashCode();
	}

	public int getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(int previousHash) {
		this.previousHash = previousHash;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	// Methods
	// Method to validate the blockChain
	public String transactionValidator(BlockChain[] B) {
		Boolean answer = true;
		for (int i = 1; i < B.length; i++) {
			if (B[i].getPreviousHash() == B[i - 1].getHash()) {
				answer = true;
			} else
				answer = false;

		}
		if (answer)
			return "BlockChain is Valid!";
		else
			return "BlockChain is inValid!";
	}

}
