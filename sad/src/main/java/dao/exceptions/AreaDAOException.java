package dao.exceptions;

public class AreaDAOException extends Exception{

    public AreaDAOException(String msg) {
		super(msg);
	}

	public AreaDAOException(Throwable trw) {
		super(trw);
	}

	public AreaDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public AreaDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}