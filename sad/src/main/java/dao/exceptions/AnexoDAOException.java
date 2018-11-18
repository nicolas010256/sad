package dao.exceptions;

public class AnexoDAOException extends Exception {

    public AnexoDAOException(String msg) {
		super(msg);
	}

	public AnexoDAOException(Throwable trw) {
		super(trw);
	}

	public AnexoDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public AnexoDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}