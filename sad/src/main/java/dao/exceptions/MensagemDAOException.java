package dao.exceptions;

public class MensagemDAOException extends Exception {

    public MensagemDAOException(String msg) {
		super(msg);
	}

	public MensagemDAOException(Throwable trw) {
		super(trw);
	}

	public MensagemDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public MensagemDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}