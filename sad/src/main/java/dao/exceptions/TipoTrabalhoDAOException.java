package dao.exceptions;

public class TipoTrabalhoDAOException extends Exception {
    
    public TipoTrabalhoDAOException(String msg) {
		super(msg);
	}

	public TipoTrabalhoDAOException(Throwable trw) {
		super(trw);
	}

	public TipoTrabalhoDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public TipoTrabalhoDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}