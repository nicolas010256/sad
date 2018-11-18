package dao.exceptions;

public class TrabalhoDAOException extends Exception {
    
    public TrabalhoDAOException(String msg) {
		super(msg);
	}

	public TrabalhoDAOException(Throwable trw) {
		super(trw);
	}

	public TrabalhoDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public TrabalhoDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}