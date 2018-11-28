package entity;

public class Notificacao {
    private long idRemetente;
    private int tipoRemetente;
    private long idDestinatario;
    private int tipoDestinatario;
    private String mensagem;
    private int tipoNotificacao;
    private int status;

    public static final int ALUNO = 0;
    public static final int ORIENTADOR = 1;

    public static final int MENSAGEM = 0;
    public static final int CONVITE = 1;

    public static final int UNREAD = 0;
    public static final int READ = 1;

    public Notificacao(long idRemetente, int tipoRemetente, long idDestinatario, int tipoDestinatario) {
        this.idRemetente = idRemetente;
        this.tipoRemetente = tipoRemetente;
        this.idDestinatario = idDestinatario;
        this.tipoDestinatario = tipoDestinatario;
    }

    public long getIdRemetente() {
        return idRemetente;
    }

    public int getTipoRemetente() {
        return tipoRemetente;
    }

    public long getIdDestinatario() {
        return idDestinatario;
    }

    public int getTipoDestinatario() {
        return tipoDestinatario;
    }

    public String getMensagem() {
        return  mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getTipoNotificacao() {
        return tipoNotificacao;
    }
    
    public void setTipoNotificacao(int tipoNotificacao) {
        this.tipoNotificacao = tipoNotificacao;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}