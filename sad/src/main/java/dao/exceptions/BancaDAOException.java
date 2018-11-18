package dao.exceptions;

public class BancaDAOException extends Exception {

    public BancaDAOException(String msg) {
		super(msg);
	}

	public BancaDAOException(Throwable trw) {
		super(trw);
	}

	public BancaDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public BancaDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}