package dao.exceptions;

public class AreaAtuacaoDAOException extends Exception {

    public AreaAtuacaoDAOException(String msg) {
		super(msg);
	}

	public AreaAtuacaoDAOException(Throwable trw) {
		super(trw);
	}

	public AreaAtuacaoDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public AreaAtuacaoDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}

}