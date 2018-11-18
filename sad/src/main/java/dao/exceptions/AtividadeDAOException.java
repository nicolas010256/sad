package dao.exceptions;

public class AtividadeDAOException extends Exception {

    public AtividadeDAOException(String msg) {
		super(msg);
	}

	public AtividadeDAOException(Throwable trw) {
		super(trw);
	}

	public AtividadeDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public AtividadeDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}