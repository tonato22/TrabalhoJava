package dao;

public class DAOFactory {
    public static ClienteDAO createClienteDAO() {
        return new ClienteDAO();
    }

    public static SeguroDAO createSeguroDAO() {
        return new SeguroDAO();
    }
}
