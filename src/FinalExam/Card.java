package FinalExam;

/**
 * This class represents a card that can be used as a payment
 */
public class Card {
	private String cardCompany;
	private String ccNum;
	private String securityCode;
	private String expDate;

	/**
	 * Getter for cardCompany
	 * @return cardCompany
	 */
	public String getCardCompany() {
		return cardCompany;
	}

	/**
	 * Setter for cardCompany
	 * @param cardCompany
	 */
	public void setCardCompany(String cardCompany) {
		this.cardCompany = cardCompany;
	}

	/**
	 * Getter for ccNum
	 * @return ccNum
	 */
	public String getCCNum() {
		return ccNum;
	}

	/**
	 * Setter for ccNum
	 * @param ccNum
	 */
	public void setCCNum(String ccNum) {
		this.ccNum = ccNum;
	}

	/**
	 * Getter for securityCode
	 * @return securityCode
	 */
	public String getSecurityCode() {
		return securityCode;
	}

	/**
	 * Setter for securityCode
	 * @param securityCode
	 */
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	/**
	 * Getter for expDate
	 * @return expDate
	 */
	public String getExpDate() {
		return expDate;
	}

	/**
	 * Setter for expDate
	 * @param expDate
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
}
