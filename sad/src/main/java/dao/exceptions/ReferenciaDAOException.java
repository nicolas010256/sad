package dao.exceptions;

public class ReferenciaDAOException extends Exception {

    public ReferenciaDAOException(String msg) {
		super(msg);
	}

	public ReferenciaDAOException(Throwable trw) {
		super(trw);
	}

	public ReferenciaDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public ReferenciaDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}