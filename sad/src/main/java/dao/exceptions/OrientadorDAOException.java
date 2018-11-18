package dao.exceptions;

public class OrientadorDAOException extends Exception {

    public OrientadorDAOException(String msg) {
		super(msg);
	}

	public OrientadorDAOException(Throwable trw) {
		super(trw);
	}

	public OrientadorDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public OrientadorDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}