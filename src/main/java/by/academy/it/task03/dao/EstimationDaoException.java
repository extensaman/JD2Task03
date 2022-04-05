package by.academy.it.task03.dao;

public class EstimationDaoException extends Exception{
    public EstimationDaoException() {
        super();
    }

    public EstimationDaoException(String message) {
        super(message);
    }

    public EstimationDaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public EstimationDaoException(Throwable cause) {
        super(cause);
    }
}
