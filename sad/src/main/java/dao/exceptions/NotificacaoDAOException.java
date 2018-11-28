package dao.exceptions;

public class NotificacaoDAOException extends Exception {

    public NotificacaoDAOException(String msg) {
		super(msg);
	}

	public NotificacaoDAOException(Throwable trw) {
		super(trw);
	}

	public NotificacaoDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public NotificacaoDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}