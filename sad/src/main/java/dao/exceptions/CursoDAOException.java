package dao.exceptions;

public class CursoDAOException extends Exception {

    public CursoDAOException(String msg) {
		super(msg);
	}

	public CursoDAOException(Throwable trw) {
		super(trw);
	}

	public CursoDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public CursoDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}