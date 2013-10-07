package crm.xingi.exceptions;

public abstract class CrmFault extends Exception  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CrmFault(String msg){
		super(msg);
	}
}
