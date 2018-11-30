package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import dao.exceptions.AtividadeDAOException;
import entity.Atividade;
import entity.Trabalho;

public class AtividadeDAOImpl implements AtividadeDAO {

    @Override
    public void add(Atividade atividade, Trabalho trabalho) throws AtividadeDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "INSERT INTO Atividade (Titulo,Descricao,Status,idTrabalho) VALUES (?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, atividade.getTitulo());
            st.setString(2, atividade.getDescricao());
            st.setString(3, atividade.getStatus());
            if (trabalho != null){
                st.setLong(4, trabalho.getId());
            } else {
                st.setNull(4, Types.INTEGER);
            }
            st.executeUpdate();
            st.close();

        } catch (SQLException e) {
            throw new AtividadeDAOException("Erro ao inserir atividade");
        } finally {
            JDBCUtil.close(con);
        }  
    }

    @Override
    public Atividade get(long id) throws AtividadeDAOException {
        Atividade atividade = null;
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            String sql = "SELECT Titulo, Descricao, Status FROM Atividade WHERE idAtividade = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.first()) {
                String nome = rs.getString("Nome");
                String descricao = rs.getString("Descricao");
                String status = rs.getString("Status");

                atividade = new Atividade(id, nome, descricao,status);
            }
            st.close();
        } catch (SQLException e) {
            throw new AtividadeDAOException("Erro ao pesquisar atividade");
        } finally {
            JDBCUtil.close(con);
        }
        return atividade;
    }

    @Override
    public List<Atividade> getByTrabalho(Trabalho trabalho) throws AtividadeDAOException {
        List<Atividade> atividades = new ArrayList<Atividade>();
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql = "SELECT a.idAtividade, a.Titulo, a.Descricao, a.Status, a.idTrabalho FROM Atividade a INNER JOIN Trabalho t ON (a.idTrabalho = t.idTrabalho) WHERE a.idTrabalho = ?";

            PreparedStatement st = con.prepareStatement(sql);
            st.setLong(1, trabalho.getId());

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                long id = rs.getLong("a.idAtividade");
                String nome = rs.getString("a.Titulo");
                String descricao = rs.getString("a.Descricao");
                String status = rs.getString("a.Status");
                Atividade atividade = new Atividade(id, nome, descricao,status);
                atividades.add(atividade);
            }
            st.close();

        } catch (SQLException e) {
            throw new AtividadeDAOException("Erro ao pesquisar atividades");
        } finally {
            JDBCUtil.close(con);
        }
        return atividades;
    }

    @Override
    public void update(Atividade atividade) throws AtividadeDAOException {
        Connection con = null;

        try {
            con = JDBCUtil.getConnection();

            String sql =    "UPDATE Atividade " +
                            "SET Titulo=?, Descricao=?, Status=? " +
                            "WHERE idAtividade=?";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, atividade.getTitulo());
            st.setString(2, atividade.getDescricao());
            st.setString(3, atividade.getStatus());
            st.setLong(4, atividade.getId());

            st.executeUpdate();

            st.close();

        } catch (SQLException e) {
            throw new AtividadeDAOException("Erro ao alterar atributos da atividade");
        } finally {
            JDBCUtil.close(con);
        }
	}

	@Override
	public void remove(Atividade atividade) throws AtividadeDAOException {
		Connection con = null;

        try {
            con = JDBCUtil.getConnection();
            
            String sql = "DELETE FROM Atividade WHERE idAtividade = ?";

            PreparedStatement st = con.prepareStatement(sql);

            st.setLong(1, atividade.getId());

            st.executeUpdate();

            st.close();

        } catch (Exception e) {
            throw new AtividadeDAOException("Erro ao excluir atividade");
        } finally {
            JDBCUtil.close(con);
        }
	}

}