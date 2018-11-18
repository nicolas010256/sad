package dao.exceptions;

public class AlunoDAOException extends Exception {
    
    public AlunoDAOException(String msg) {
		super(msg);
	}

	public AlunoDAOException(Throwable trw) {
		super(trw);
	}

	public AlunoDAOException(String msg, Throwable trw) {
		super(msg, trw);
	}

	public AlunoDAOException(String msg, Throwable trw, boolean enableSuppresion,
			boolean writeStackTrace) {
		super(msg, trw, enableSuppresion, writeStackTrace);
	}
}